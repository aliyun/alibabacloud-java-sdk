// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationAppResponseBody body;

    public static ListAuthorizationAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationAppResponse self = new ListAuthorizationAppResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationAppResponse setBody(ListAuthorizationAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationAppResponseBody getBody() {
        return this.body;
    }

}
