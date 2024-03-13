// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectLivingFaceResponseBody body;

    public static DetectLivingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLivingFaceResponse self = new DetectLivingFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectLivingFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectLivingFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectLivingFaceResponse setBody(DetectLivingFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectLivingFaceResponseBody getBody() {
        return this.body;
    }

}
