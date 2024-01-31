// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoModerationCancelResponseBody body;

    public static VideoModerationCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationCancelResponse self = new VideoModerationCancelResponse();
        return TeaModel.build(map, self);
    }

    public VideoModerationCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoModerationCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoModerationCancelResponse setBody(VideoModerationCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoModerationCancelResponseBody getBody() {
        return this.body;
    }

}
