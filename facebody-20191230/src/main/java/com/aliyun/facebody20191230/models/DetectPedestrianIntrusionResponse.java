// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetectPedestrianIntrusionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectPedestrianIntrusionResponse setBody(DetectPedestrianIntrusionResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectPedestrianIntrusionResponseBody getBody() {
        return this.body;
    }

}
