// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectInfraredLivingFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectInfraredLivingFaceResponseBody body;

    public static DetectInfraredLivingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectInfraredLivingFaceResponse self = new DetectInfraredLivingFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectInfraredLivingFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectInfraredLivingFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectInfraredLivingFaceResponse setBody(DetectInfraredLivingFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectInfraredLivingFaceResponseBody getBody() {
        return this.body;
    }

}
