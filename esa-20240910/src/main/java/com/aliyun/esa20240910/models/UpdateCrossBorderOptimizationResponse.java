// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCrossBorderOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCrossBorderOptimizationResponseBody body;

    public static UpdateCrossBorderOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBorderOptimizationResponse self = new UpdateCrossBorderOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBorderOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrossBorderOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCrossBorderOptimizationResponse setBody(UpdateCrossBorderOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrossBorderOptimizationResponseBody getBody() {
        return this.body;
    }

}
