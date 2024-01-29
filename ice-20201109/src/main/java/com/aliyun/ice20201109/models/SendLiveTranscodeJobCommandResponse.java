// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveTranscodeJobCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendLiveTranscodeJobCommandResponseBody body;

    public static SendLiveTranscodeJobCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLiveTranscodeJobCommandResponse self = new SendLiveTranscodeJobCommandResponse();
        return TeaModel.build(map, self);
    }

    public SendLiveTranscodeJobCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLiveTranscodeJobCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLiveTranscodeJobCommandResponse setBody(SendLiveTranscodeJobCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLiveTranscodeJobCommandResponseBody getBody() {
        return this.body;
    }

}
