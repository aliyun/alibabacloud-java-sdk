// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoTranslationResponseBody body;

    public static VideoTranslationResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoTranslationResponse self = new VideoTranslationResponse();
        return TeaModel.build(map, self);
    }

    public VideoTranslationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoTranslationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoTranslationResponse setBody(VideoTranslationResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoTranslationResponseBody getBody() {
        return this.body;
    }

}
