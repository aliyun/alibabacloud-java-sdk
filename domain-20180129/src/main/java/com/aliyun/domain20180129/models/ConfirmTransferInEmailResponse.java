// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ConfirmTransferInEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConfirmTransferInEmailResponse setBody(ConfirmTransferInEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmTransferInEmailResponseBody getBody() {
        return this.body;
    }

}
