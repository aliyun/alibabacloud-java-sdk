// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationInfoResponseBody body;

    public static ListAuthorizationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationInfoResponse self = new ListAuthorizationInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationInfoResponse setBody(ListAuthorizationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationInfoResponseBody getBody() {
        return this.body;
    }

}
