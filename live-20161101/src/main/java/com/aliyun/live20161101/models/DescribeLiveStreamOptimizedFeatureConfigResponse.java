// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOptimizedFeatureConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamOptimizedFeatureConfigResponseBody body;

    public static DescribeLiveStreamOptimizedFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOptimizedFeatureConfigResponse self = new DescribeLiveStreamOptimizedFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse setBody(DescribeLiveStreamOptimizedFeatureConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamOptimizedFeatureConfigResponseBody getBody() {
        return this.body;
    }

}
