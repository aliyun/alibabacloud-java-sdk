// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveStreamTranscodeResponseBody body;

    public static UpdateLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamTranscodeResponse self = new UpdateLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveStreamTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveStreamTranscodeResponse setBody(UpdateLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
