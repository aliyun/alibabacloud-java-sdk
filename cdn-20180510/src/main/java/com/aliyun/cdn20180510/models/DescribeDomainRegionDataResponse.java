// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRegionDataResponseBody body;

    public static DescribeDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRegionDataResponse self = new DescribeDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRegionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRegionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRegionDataResponse setBody(DescribeDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
