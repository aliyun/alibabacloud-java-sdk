// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetRealtimeInstanceStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeInstanceStatesResponse setBody(GetRealtimeInstanceStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeInstanceStatesResponseBody getBody() {
        return this.body;
    }

}
