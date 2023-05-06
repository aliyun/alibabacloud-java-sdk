// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppVersionsResponseBody body;

    public static ListAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsResponse self = new ListAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppVersionsResponse setBody(ListAppVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppVersionsResponseBody getBody() {
        return this.body;
    }

}
