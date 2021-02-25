// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class LivenessDetectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LivenessDetectResponseBody body;

    public static LivenessDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        LivenessDetectResponse self = new LivenessDetectResponse();
        return TeaModel.build(map, self);
    }

    public LivenessDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LivenessDetectResponse setBody(LivenessDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public LivenessDetectResponseBody getBody() {
        return this.body;
    }

}
