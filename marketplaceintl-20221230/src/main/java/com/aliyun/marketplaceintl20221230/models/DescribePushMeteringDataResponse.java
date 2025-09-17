// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribePushMeteringDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePushMeteringDataResponseBody body;

    public static DescribePushMeteringDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePushMeteringDataResponse self = new DescribePushMeteringDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribePushMeteringDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePushMeteringDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePushMeteringDataResponse setBody(DescribePushMeteringDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePushMeteringDataResponseBody getBody() {
        return this.body;
    }

}
