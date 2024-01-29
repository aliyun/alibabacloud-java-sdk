// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitAudioProduceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAudioProduceJobResponse setBody(SubmitAudioProduceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAudioProduceJobResponseBody getBody() {
        return this.body;
    }

}
