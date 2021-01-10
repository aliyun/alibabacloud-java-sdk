// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCustomLiveStreamTranscodeResponseBody body;

    public static AddCustomLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeResponse self = new AddCustomLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomLiveStreamTranscodeResponse setBody(AddCustomLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
