// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoModerationResultResponseBody body;

    public static VideoModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationResultResponse self = new VideoModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public VideoModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoModerationResultResponse setBody(VideoModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoModerationResultResponseBody getBody() {
        return this.body;
    }

}
