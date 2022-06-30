// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public SwapFacialFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwapFacialFeaturesResponse setBody(SwapFacialFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public SwapFacialFeaturesResponseBody getBody() {
        return this.body;
    }

}
