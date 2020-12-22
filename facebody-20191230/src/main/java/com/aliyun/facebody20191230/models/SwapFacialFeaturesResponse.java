// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwapFacialFeaturesResponseBody body;

    public static SwapFacialFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesResponse self = new SwapFacialFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwapFacialFeaturesResponse setBody(SwapFacialFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public SwapFacialFeaturesResponseBody getBody() {
        return this.body;
    }

}
