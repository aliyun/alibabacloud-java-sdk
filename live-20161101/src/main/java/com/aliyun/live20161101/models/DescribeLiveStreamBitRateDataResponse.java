// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamBitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamBitRateDataResponseBody body;

    public static DescribeLiveStreamBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamBitRateDataResponse self = new DescribeLiveStreamBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamBitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamBitRateDataResponse setBody(DescribeLiveStreamBitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamBitRateDataResponseBody getBody() {
        return this.body;
    }

}
