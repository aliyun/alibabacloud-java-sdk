// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListImageByAppIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListImageByAppIdResponseBody body;

    public static ListImageByAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageByAppIdResponse self = new ListImageByAppIdResponse();
        return TeaModel.build(map, self);
    }

    public ListImageByAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageByAppIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageByAppIdResponse setBody(ListImageByAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageByAppIdResponseBody getBody() {
        return this.body;
    }

}
