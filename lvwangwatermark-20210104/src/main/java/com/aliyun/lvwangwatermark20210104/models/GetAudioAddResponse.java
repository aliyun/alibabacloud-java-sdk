// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioAddResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudioAddResponseBody body;

    public static GetAudioAddResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAddResponse self = new GetAudioAddResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioAddResponse setBody(GetAudioAddResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioAddResponseBody getBody() {
        return this.body;
    }

}
