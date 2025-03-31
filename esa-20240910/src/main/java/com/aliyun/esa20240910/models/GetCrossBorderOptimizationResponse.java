// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCrossBorderOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrossBorderOptimizationResponseBody body;

    public static GetCrossBorderOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrossBorderOptimizationResponse self = new GetCrossBorderOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public GetCrossBorderOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrossBorderOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrossBorderOptimizationResponse setBody(GetCrossBorderOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrossBorderOptimizationResponseBody getBody() {
        return this.body;
    }

}
