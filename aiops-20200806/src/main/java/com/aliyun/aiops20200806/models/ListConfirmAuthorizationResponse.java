// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListConfirmAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfirmAuthorizationResponseBody body;

    public static ListConfirmAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfirmAuthorizationResponse self = new ListConfirmAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListConfirmAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfirmAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfirmAuthorizationResponse setBody(ListConfirmAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfirmAuthorizationResponseBody getBody() {
        return this.body;
    }

}
