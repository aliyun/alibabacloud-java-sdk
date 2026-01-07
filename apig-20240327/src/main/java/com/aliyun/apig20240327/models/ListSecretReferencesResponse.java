// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretReferencesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecretReferencesResponseBody body;

    public static ListSecretReferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretReferencesResponse self = new ListSecretReferencesResponse();
        return TeaModel.build(map, self);
    }

    public ListSecretReferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecretReferencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecretReferencesResponse setBody(ListSecretReferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretReferencesResponseBody getBody() {
        return this.body;
    }

}
