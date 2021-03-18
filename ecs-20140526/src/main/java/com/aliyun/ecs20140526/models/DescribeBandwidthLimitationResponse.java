// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBandwidthLimitationResponseBody body;

    public static DescribeBandwidthLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationResponse self = new DescribeBandwidthLimitationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthLimitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBandwidthLimitationResponse setBody(DescribeBandwidthLimitationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBandwidthLimitationResponseBody getBody() {
        return this.body;
    }

}
