// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicSubscribeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicSubscribeStatusResponseBody body;

    public static GetTopicSubscribeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSubscribeStatusResponse self = new GetTopicSubscribeStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicSubscribeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicSubscribeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicSubscribeStatusResponse setBody(GetTopicSubscribeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicSubscribeStatusResponseBody getBody() {
        return this.body;
    }

}
