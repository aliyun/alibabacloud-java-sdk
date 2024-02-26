// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerProgressResponseBody body;

    public static GetConsumerProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerProgressResponse self = new GetConsumerProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerProgressResponse setBody(GetConsumerProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerProgressResponseBody getBody() {
        return this.body;
    }

}
