// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceBeautyResponseBody body;

    public static FaceBeautyResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyResponse self = new FaceBeautyResponse();
        return TeaModel.build(map, self);
    }

    public FaceBeautyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceBeautyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceBeautyResponse setBody(FaceBeautyResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceBeautyResponseBody getBody() {
        return this.body;
    }

}
