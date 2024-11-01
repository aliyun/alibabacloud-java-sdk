// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomHotTopicBroadcastJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCustomHotTopicBroadcastJobResponseBody body;

    public static SubmitCustomHotTopicBroadcastJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomHotTopicBroadcastJobResponse self = new SubmitCustomHotTopicBroadcastJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCustomHotTopicBroadcastJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCustomHotTopicBroadcastJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCustomHotTopicBroadcastJobResponse setBody(SubmitCustomHotTopicBroadcastJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCustomHotTopicBroadcastJobResponseBody getBody() {
        return this.body;
    }

}
