// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetRealtimeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRealtimeTaskResponseBody body;

    public static GetRealtimeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeTaskResponse self = new GetRealtimeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeTaskResponse setBody(GetRealtimeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeTaskResponseBody getBody() {
        return this.body;
    }

}
