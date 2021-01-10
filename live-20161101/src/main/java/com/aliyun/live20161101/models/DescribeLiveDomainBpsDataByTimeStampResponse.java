// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByTimeStampResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainBpsDataByTimeStampResponseBody body;

    public static DescribeLiveDomainBpsDataByTimeStampResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByTimeStampResponse self = new DescribeLiveDomainBpsDataByTimeStampResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse setBody(DescribeLiveDomainBpsDataByTimeStampResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainBpsDataByTimeStampResponseBody getBody() {
        return this.body;
    }

}
