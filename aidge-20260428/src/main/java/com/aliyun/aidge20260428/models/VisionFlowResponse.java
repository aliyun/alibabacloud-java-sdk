// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VisionFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VisionFlowResponseBody body;

    public static VisionFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        VisionFlowResponse self = new VisionFlowResponse();
        return TeaModel.build(map, self);
    }

    public VisionFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VisionFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VisionFlowResponse setBody(VisionFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public VisionFlowResponseBody getBody() {
        return this.body;
    }

}
