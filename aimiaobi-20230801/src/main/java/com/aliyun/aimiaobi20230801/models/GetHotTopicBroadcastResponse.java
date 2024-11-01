// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetHotTopicBroadcastResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotTopicBroadcastResponseBody body;

    public static GetHotTopicBroadcastResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotTopicBroadcastResponse self = new GetHotTopicBroadcastResponse();
        return TeaModel.build(map, self);
    }

    public GetHotTopicBroadcastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotTopicBroadcastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotTopicBroadcastResponse setBody(GetHotTopicBroadcastResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotTopicBroadcastResponseBody getBody() {
        return this.body;
    }

}
