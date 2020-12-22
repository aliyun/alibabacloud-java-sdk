// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizePublicFaceResponseBody body;

    public static RecognizePublicFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceResponse self = new RecognizePublicFaceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePublicFaceResponse setBody(RecognizePublicFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePublicFaceResponseBody getBody() {
        return this.body;
    }

}
