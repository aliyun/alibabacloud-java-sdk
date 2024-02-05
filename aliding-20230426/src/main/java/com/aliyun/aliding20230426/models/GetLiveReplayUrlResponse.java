// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveReplayUrlResponseBody body;

    public static GetLiveReplayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlResponse self = new GetLiveReplayUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveReplayUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveReplayUrlResponse setBody(GetLiveReplayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveReplayUrlResponseBody getBody() {
        return this.body;
    }

}
