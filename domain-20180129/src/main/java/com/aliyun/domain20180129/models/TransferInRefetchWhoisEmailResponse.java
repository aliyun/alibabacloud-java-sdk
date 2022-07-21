// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInRefetchWhoisEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransferInRefetchWhoisEmailResponseBody body;

    public static TransferInRefetchWhoisEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferInRefetchWhoisEmailResponse self = new TransferInRefetchWhoisEmailResponse();
        return TeaModel.build(map, self);
    }

    public TransferInRefetchWhoisEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferInRefetchWhoisEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferInRefetchWhoisEmailResponse setBody(TransferInRefetchWhoisEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferInRefetchWhoisEmailResponseBody getBody() {
        return this.body;
    }

}
