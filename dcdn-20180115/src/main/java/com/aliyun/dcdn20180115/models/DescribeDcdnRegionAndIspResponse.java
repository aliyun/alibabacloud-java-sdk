// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRegionAndIspResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnRegionAndIspResponseBody body;

    public static DescribeDcdnRegionAndIspResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRegionAndIspResponse self = new DescribeDcdnRegionAndIspResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRegionAndIspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRegionAndIspResponse setBody(DescribeDcdnRegionAndIspResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRegionAndIspResponseBody getBody() {
        return this.body;
    }

}
