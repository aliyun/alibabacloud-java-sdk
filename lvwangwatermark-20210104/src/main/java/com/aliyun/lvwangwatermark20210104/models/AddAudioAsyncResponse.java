// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddAudioAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAudioAsyncResponseBody body;

    public static AddAudioAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAudioAsyncResponse self = new AddAudioAsyncResponse();
        return TeaModel.build(map, self);
    }

    public AddAudioAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAudioAsyncResponse setBody(AddAudioAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAudioAsyncResponseBody getBody() {
        return this.body;
    }

}
