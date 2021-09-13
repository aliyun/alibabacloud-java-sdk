// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BlindTransferResponseBody body;

    public static BlindTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        BlindTransferResponse self = new BlindTransferResponse();
        return TeaModel.build(map, self);
    }

    public BlindTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlindTransferResponse setBody(BlindTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public BlindTransferResponseBody getBody() {
        return this.body;
    }

}
