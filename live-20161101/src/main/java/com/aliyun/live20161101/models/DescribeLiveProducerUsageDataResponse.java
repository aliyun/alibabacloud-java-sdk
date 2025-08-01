// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveProducerUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveProducerUsageDataResponseBody body;

    public static DescribeLiveProducerUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveProducerUsageDataResponse self = new DescribeLiveProducerUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveProducerUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveProducerUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveProducerUsageDataResponse setBody(DescribeLiveProducerUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveProducerUsageDataResponseBody getBody() {
        return this.body;
    }

}
