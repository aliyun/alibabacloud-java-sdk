// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicByIdResponseBody body;

    public static GetTopicByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicByIdResponse self = new GetTopicByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicByIdResponse setBody(GetTopicByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicByIdResponseBody getBody() {
        return this.body;
    }

}
