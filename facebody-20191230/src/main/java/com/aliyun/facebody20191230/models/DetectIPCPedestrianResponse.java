// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectIPCPedestrianResponseBody body;

    public static DetectIPCPedestrianResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianResponse self = new DetectIPCPedestrianResponse();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectIPCPedestrianResponse setBody(DetectIPCPedestrianResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectIPCPedestrianResponseBody getBody() {
        return this.body;
    }

}
