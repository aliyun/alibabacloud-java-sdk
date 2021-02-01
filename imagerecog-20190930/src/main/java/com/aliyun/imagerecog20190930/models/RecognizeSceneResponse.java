// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeSceneResponseBody body;

    public static RecognizeSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSceneResponse self = new RecognizeSceneResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeSceneResponse setBody(RecognizeSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeSceneResponseBody getBody() {
        return this.body;
    }

}
