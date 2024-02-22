// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetTopicStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicStatusResponseBody body;

    public static GetTopicStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicStatusResponse self = new GetTopicStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicStatusResponse setBody(GetTopicStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicStatusResponseBody getBody() {
        return this.body;
    }

}
