// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddRtsLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddRtsLiveStreamTranscodeResponseBody body;

    public static AddRtsLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRtsLiveStreamTranscodeResponse self = new AddRtsLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public AddRtsLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRtsLiveStreamTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRtsLiveStreamTranscodeResponse setBody(AddRtsLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRtsLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
