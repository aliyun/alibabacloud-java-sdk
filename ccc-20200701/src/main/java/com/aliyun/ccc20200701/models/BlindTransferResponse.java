// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BlindTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlindTransferResponse setBody(BlindTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public BlindTransferResponseBody getBody() {
        return this.body;
    }

}
