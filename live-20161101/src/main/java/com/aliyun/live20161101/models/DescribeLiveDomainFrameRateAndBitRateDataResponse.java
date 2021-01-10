// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainFrameRateAndBitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody body;

    public static DescribeLiveDomainFrameRateAndBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainFrameRateAndBitRateDataResponse self = new DescribeLiveDomainFrameRateAndBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse setBody(DescribeLiveDomainFrameRateAndBitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody getBody() {
        return this.body;
    }

}
