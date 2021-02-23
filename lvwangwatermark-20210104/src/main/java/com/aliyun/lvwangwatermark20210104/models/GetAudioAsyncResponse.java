// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudioAsyncResponseBody body;

    public static GetAudioAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsyncResponse self = new GetAudioAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioAsyncResponse setBody(GetAudioAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioAsyncResponseBody getBody() {
        return this.body;
    }

}
