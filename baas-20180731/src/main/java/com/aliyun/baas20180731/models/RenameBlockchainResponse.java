// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class RenameBlockchainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameBlockchainResponseBody body;

    public static RenameBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameBlockchainResponse self = new RenameBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public RenameBlockchainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameBlockchainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameBlockchainResponse setBody(RenameBlockchainResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameBlockchainResponseBody getBody() {
        return this.body;
    }

}
