// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterSceneAudioResponseBody body;

    public static DescribeCasterSceneAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioResponse self = new DescribeCasterSceneAudioResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSceneAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterSceneAudioResponse setBody(DescribeCasterSceneAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterSceneAudioResponseBody getBody() {
        return this.body;
    }

}
