// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianOptimizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectIPCPedestrianOptimizedResponseBody body;

    public static DetectIPCPedestrianOptimizedResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianOptimizedResponse self = new DetectIPCPedestrianOptimizedResponse();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianOptimizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectIPCPedestrianOptimizedResponse setBody(DetectIPCPedestrianOptimizedResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectIPCPedestrianOptimizedResponseBody getBody() {
        return this.body;
    }

}
