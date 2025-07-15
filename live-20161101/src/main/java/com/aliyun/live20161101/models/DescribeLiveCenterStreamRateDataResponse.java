// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterStreamRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveCenterStreamRateDataResponseBody body;

    public static DescribeLiveCenterStreamRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCenterStreamRateDataResponse self = new DescribeLiveCenterStreamRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCenterStreamRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCenterStreamRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveCenterStreamRateDataResponse setBody(DescribeLiveCenterStreamRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCenterStreamRateDataResponseBody getBody() {
        return this.body;
    }

}
