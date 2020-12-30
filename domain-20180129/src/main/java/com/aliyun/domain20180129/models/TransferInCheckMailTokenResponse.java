// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInCheckMailTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferInCheckMailTokenResponseBody body;

    public static TransferInCheckMailTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferInCheckMailTokenResponse self = new TransferInCheckMailTokenResponse();
        return TeaModel.build(map, self);
    }

    public TransferInCheckMailTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferInCheckMailTokenResponse setBody(TransferInCheckMailTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferInCheckMailTokenResponseBody getBody() {
        return this.body;
    }

}
