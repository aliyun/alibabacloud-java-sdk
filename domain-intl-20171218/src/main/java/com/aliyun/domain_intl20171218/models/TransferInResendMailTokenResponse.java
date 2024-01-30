// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class TransferInResendMailTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferInResendMailTokenResponseBody body;

    public static TransferInResendMailTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferInResendMailTokenResponse self = new TransferInResendMailTokenResponse();
        return TeaModel.build(map, self);
    }

    public TransferInResendMailTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferInResendMailTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferInResendMailTokenResponse setBody(TransferInResendMailTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferInResendMailTokenResponseBody getBody() {
        return this.body;
    }

}
