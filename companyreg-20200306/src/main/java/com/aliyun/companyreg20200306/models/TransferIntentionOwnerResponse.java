// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class TransferIntentionOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferIntentionOwnerResponseBody body;

    public static TransferIntentionOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferIntentionOwnerResponse self = new TransferIntentionOwnerResponse();
        return TeaModel.build(map, self);
    }

    public TransferIntentionOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferIntentionOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferIntentionOwnerResponse setBody(TransferIntentionOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferIntentionOwnerResponseBody getBody() {
        return this.body;
    }

}
