// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectVideoLivingFaceResponseBody body;

    public static DetectVideoLivingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoLivingFaceResponse self = new DetectVideoLivingFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectVideoLivingFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVideoLivingFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectVideoLivingFaceResponse setBody(DetectVideoLivingFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVideoLivingFaceResponseBody getBody() {
        return this.body;
    }

}
