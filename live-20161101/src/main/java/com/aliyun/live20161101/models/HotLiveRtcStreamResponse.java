// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class HotLiveRtcStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotLiveRtcStreamResponseBody body;

    public static HotLiveRtcStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        HotLiveRtcStreamResponse self = new HotLiveRtcStreamResponse();
        return TeaModel.build(map, self);
    }

    public HotLiveRtcStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotLiveRtcStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotLiveRtcStreamResponse setBody(HotLiveRtcStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public HotLiveRtcStreamResponseBody getBody() {
        return this.body;
    }

}
