// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveCenterTransferResponseBody body;

    public static DescribeLiveCenterTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCenterTransferResponse self = new DescribeLiveCenterTransferResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCenterTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCenterTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveCenterTransferResponse setBody(DescribeLiveCenterTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCenterTransferResponseBody getBody() {
        return this.body;
    }

}
