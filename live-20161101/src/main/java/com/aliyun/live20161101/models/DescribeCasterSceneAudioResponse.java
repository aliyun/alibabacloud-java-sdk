// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCasterSceneAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasterSceneAudioResponse setBody(DescribeCasterSceneAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterSceneAudioResponseBody getBody() {
        return this.body;
    }

}
