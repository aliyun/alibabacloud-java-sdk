// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListProofChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProofChainResponseBody body;

    public static ListProofChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProofChainResponse self = new ListProofChainResponse();
        return TeaModel.build(map, self);
    }

    public ListProofChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProofChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProofChainResponse setBody(ListProofChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProofChainResponseBody getBody() {
        return this.body;
    }

}
