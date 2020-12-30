// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainBpsDataByTimeStampResponseBody body;

    public static DescribeDomainBpsDataByTimeStampResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByTimeStampResponse self = new DescribeDomainBpsDataByTimeStampResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByTimeStampResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBpsDataByTimeStampResponse setBody(DescribeDomainBpsDataByTimeStampResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBpsDataByTimeStampResponseBody getBody() {
        return this.body;
    }

}
