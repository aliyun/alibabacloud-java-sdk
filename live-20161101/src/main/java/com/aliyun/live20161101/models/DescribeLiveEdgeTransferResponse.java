// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveEdgeTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveEdgeTransferResponseBody body;

    public static DescribeLiveEdgeTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveEdgeTransferResponse self = new DescribeLiveEdgeTransferResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveEdgeTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveEdgeTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveEdgeTransferResponse setBody(DescribeLiveEdgeTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

}
