// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoFeedbackResponseBody body;

    public static VideoFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoFeedbackResponse self = new VideoFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public VideoFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoFeedbackResponse setBody(VideoFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoFeedbackResponseBody getBody() {
        return this.body;
    }

}
