// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudioTraceResponseBody body;

    public static GetAudioTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioTraceResponse self = new GetAudioTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioTraceResponse setBody(GetAudioTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioTraceResponseBody getBody() {
        return this.body;
    }

}
