// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddLiveStreamTranscodeResponse setBody(AddLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
