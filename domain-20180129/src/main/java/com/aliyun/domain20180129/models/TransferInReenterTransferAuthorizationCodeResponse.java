// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInReenterTransferAuthorizationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferInReenterTransferAuthorizationCodeResponseBody body;

    public static TransferInReenterTransferAuthorizationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferInReenterTransferAuthorizationCodeResponse self = new TransferInReenterTransferAuthorizationCodeResponse();
        return TeaModel.build(map, self);
    }

    public TransferInReenterTransferAuthorizationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferInReenterTransferAuthorizationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferInReenterTransferAuthorizationCodeResponse setBody(TransferInReenterTransferAuthorizationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferInReenterTransferAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

}
