// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomHotTopicBroadcastJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomHotTopicBroadcastJobResponseBody body;

    public static GetCustomHotTopicBroadcastJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHotTopicBroadcastJobResponse self = new GetCustomHotTopicBroadcastJobResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomHotTopicBroadcastJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomHotTopicBroadcastJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomHotTopicBroadcastJobResponse setBody(GetCustomHotTopicBroadcastJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomHotTopicBroadcastJobResponseBody getBody() {
        return this.body;
    }

}
