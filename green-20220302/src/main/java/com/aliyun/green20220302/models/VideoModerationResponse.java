// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VideoModerationResponseBody body;

    public static VideoModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationResponse self = new VideoModerationResponse();
        return TeaModel.build(map, self);
    }

    public VideoModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoModerationResponse setBody(VideoModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoModerationResponseBody getBody() {
        return this.body;
    }

}
