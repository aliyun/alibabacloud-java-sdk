// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectFaceResponseBody body;

    public static DetectFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceResponse self = new DetectFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectFaceResponse setBody(DetectFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectFaceResponseBody getBody() {
        return this.body;
    }

}
