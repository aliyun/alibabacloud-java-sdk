// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCustomLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomLiveStreamTranscodeResponseBody body;

    public static UpdateCustomLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLiveStreamTranscodeResponse self = new UpdateCustomLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomLiveStreamTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomLiveStreamTranscodeResponse setBody(UpdateCustomLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
