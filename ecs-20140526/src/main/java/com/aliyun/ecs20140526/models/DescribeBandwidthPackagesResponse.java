// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeBandwidthPackagesResponse setBody(DescribeBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
