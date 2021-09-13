// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMultiChannelRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMultiChannelRecordingResponseBody body;

    public static GetMultiChannelRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiChannelRecordingResponse self = new GetMultiChannelRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiChannelRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiChannelRecordingResponse setBody(GetMultiChannelRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiChannelRecordingResponseBody getBody() {
        return this.body;
    }

}
