// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRealtimeInstanceStatesResponseBody body;

    public static GetRealtimeInstanceStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatesResponse self = new GetRealtimeInstanceStatesResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeInstanceStatesResponse setBody(GetRealtimeInstanceStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeInstanceStatesResponseBody getBody() {
        return this.body;
    }

}
