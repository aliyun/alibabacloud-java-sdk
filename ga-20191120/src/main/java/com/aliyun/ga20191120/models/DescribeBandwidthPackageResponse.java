// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBandwidthPackageResponseBody body;

    public static DescribeBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageResponse self = new DescribeBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwidthPackageResponse setBody(DescribeBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
