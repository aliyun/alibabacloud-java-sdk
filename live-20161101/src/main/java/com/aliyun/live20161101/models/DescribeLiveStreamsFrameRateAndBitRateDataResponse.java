// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsFrameRateAndBitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBody body;

    public static DescribeLiveStreamsFrameRateAndBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsFrameRateAndBitRateDataResponse self = new DescribeLiveStreamsFrameRateAndBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse setBody(DescribeLiveStreamsFrameRateAndBitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBody getBody() {
        return this.body;
    }

}
