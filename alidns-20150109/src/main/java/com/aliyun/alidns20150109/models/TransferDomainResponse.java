// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferDomainResponseBody body;

    public static TransferDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainResponse self = new TransferDomainResponse();
        return TeaModel.build(map, self);
    }

    public TransferDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferDomainResponse setBody(TransferDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferDomainResponseBody getBody() {
        return this.body;
    }

}
