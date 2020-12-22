// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FaceFilterResponseBody body;

    public static FaceFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceFilterResponse self = new FaceFilterResponse();
        return TeaModel.build(map, self);
    }

    public FaceFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceFilterResponse setBody(FaceFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceFilterResponseBody getBody() {
        return this.body;
    }

}
