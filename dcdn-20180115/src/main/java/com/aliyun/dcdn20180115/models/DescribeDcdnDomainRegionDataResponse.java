// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainRegionDataResponseBody body;

    public static DescribeDcdnDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRegionDataResponse self = new DescribeDcdnDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRegionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRegionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainRegionDataResponse setBody(DescribeDcdnDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
