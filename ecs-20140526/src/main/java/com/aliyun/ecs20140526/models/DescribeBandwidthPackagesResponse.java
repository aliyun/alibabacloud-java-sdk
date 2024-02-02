// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBandwidthPackagesResponseBody body;

    public static DescribeBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesResponse self = new DescribeBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBandwidthPackagesResponse setBody(DescribeBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
