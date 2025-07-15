// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtsLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRtsLiveStreamTranscodeResponseBody body;

    public static UpdateRtsLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtsLiveStreamTranscodeResponse self = new UpdateRtsLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRtsLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRtsLiveStreamTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRtsLiveStreamTranscodeResponse setBody(UpdateRtsLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRtsLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
