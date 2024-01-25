// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ConfirmTransferInEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmTransferInEmailResponseBody body;

    public static ConfirmTransferInEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTransferInEmailResponse self = new ConfirmTransferInEmailResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmTransferInEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmTransferInEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmTransferInEmailResponse setBody(ConfirmTransferInEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmTransferInEmailResponseBody getBody() {
        return this.body;
    }

}
