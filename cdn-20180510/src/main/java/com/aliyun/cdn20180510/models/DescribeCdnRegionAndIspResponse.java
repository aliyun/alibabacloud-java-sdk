// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnRegionAndIspResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnRegionAndIspResponseBody body;

    public static DescribeCdnRegionAndIspResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnRegionAndIspResponse self = new DescribeCdnRegionAndIspResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnRegionAndIspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnRegionAndIspResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnRegionAndIspResponse setBody(DescribeCdnRegionAndIspResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnRegionAndIspResponseBody getBody() {
        return this.body;
    }

}
