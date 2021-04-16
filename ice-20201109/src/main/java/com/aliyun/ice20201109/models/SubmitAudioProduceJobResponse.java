// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAudioProduceJobResponseBody body;

    public static SubmitAudioProduceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioProduceJobResponse self = new SubmitAudioProduceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAudioProduceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAudioProduceJobResponse setBody(SubmitAudioProduceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAudioProduceJobResponseBody getBody() {
        return this.body;
    }

}
