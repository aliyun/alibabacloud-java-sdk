// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamOptimizedFeatureConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLiveStreamOptimizedFeatureConfigResponseBody body;

    public static SetLiveStreamOptimizedFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamOptimizedFeatureConfigResponse self = new SetLiveStreamOptimizedFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setBody(SetLiveStreamOptimizedFeatureConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamOptimizedFeatureConfigResponseBody getBody() {
        return this.body;
    }

}
