// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceGroupsByUserIdResponseBody body;

    public static ListServiceGroupsByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsByUserIdResponse self = new ListServiceGroupsByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceGroupsByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceGroupsByUserIdResponse setBody(ListServiceGroupsByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceGroupsByUserIdResponseBody getBody() {
        return this.body;
    }

}
