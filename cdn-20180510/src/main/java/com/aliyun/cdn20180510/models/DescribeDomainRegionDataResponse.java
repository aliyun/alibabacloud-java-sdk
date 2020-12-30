// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainRegionDataResponse setBody(DescribeDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
