// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveStreamTranscodeResponseBody body;

    public static AddLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamTranscodeResponse self = new AddLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveStreamTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveStreamTranscodeResponse setBody(AddLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
