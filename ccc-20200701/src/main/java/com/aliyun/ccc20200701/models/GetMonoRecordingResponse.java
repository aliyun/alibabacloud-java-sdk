// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMonoRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonoRecordingResponseBody body;

    public static GetMonoRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonoRecordingResponse self = new GetMonoRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetMonoRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonoRecordingResponse setBody(GetMonoRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonoRecordingResponseBody getBody() {
        return this.body;
    }

}
