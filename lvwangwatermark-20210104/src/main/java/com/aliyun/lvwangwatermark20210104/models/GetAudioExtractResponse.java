// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudioExtractResponseBody body;

    public static GetAudioExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioExtractResponse self = new GetAudioExtractResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioExtractResponse setBody(GetAudioExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioExtractResponseBody getBody() {
        return this.body;
    }

}
