// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainRegionDataResponse setBody(DescribeDcdnDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
