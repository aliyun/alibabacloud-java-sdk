// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRegionAndIspResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnRegionAndIspResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnRegionAndIspResponse setBody(DescribeDcdnRegionAndIspResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRegionAndIspResponseBody getBody() {
        return this.body;
    }

}
