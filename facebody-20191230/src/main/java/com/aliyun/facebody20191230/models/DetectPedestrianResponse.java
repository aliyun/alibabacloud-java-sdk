// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectPedestrianResponseBody body;

    public static DetectPedestrianResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianResponse self = new DetectPedestrianResponse();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectPedestrianResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectPedestrianResponse setBody(DetectPedestrianResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectPedestrianResponseBody getBody() {
        return this.body;
    }

}
