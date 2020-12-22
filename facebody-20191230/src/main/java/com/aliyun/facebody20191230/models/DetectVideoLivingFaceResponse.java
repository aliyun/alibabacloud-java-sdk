// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetectVideoLivingFaceResponse setBody(DetectVideoLivingFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVideoLivingFaceResponseBody getBody() {
        return this.body;
    }

}
