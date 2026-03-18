// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCredentialProvidersResponseBody body;

    public static ListCredentialProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialProvidersResponse self = new ListCredentialProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListCredentialProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCredentialProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCredentialProvidersResponse setBody(ListCredentialProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCredentialProvidersResponseBody getBody() {
        return this.body;
    }

}
