// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetRealtimeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public GetRealtimeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeTaskResponse setBody(GetRealtimeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeTaskResponseBody getBody() {
        return this.body;
    }

}
