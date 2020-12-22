// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectPedestrianIntrusionResponseBody body;

    public static DetectPedestrianIntrusionResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionResponse self = new DetectPedestrianIntrusionResponse();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectPedestrianIntrusionResponse setBody(DetectPedestrianIntrusionResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectPedestrianIntrusionResponseBody getBody() {
        return this.body;
    }

}
