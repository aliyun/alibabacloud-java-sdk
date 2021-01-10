// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveStreamTranscodeResponseBody body;

    public static DeleteLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamTranscodeResponse self = new DeleteLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamTranscodeResponse setBody(DeleteLiveStreamTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamTranscodeResponseBody getBody() {
        return this.body;
    }

}
