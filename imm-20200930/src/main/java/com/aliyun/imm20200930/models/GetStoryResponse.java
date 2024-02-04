// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetStoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStoryResponseBody body;

    public static GetStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStoryResponse self = new GetStoryResponse();
        return TeaModel.build(map, self);
    }

    public GetStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStoryResponse setBody(GetStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStoryResponseBody getBody() {
        return this.body;
    }

}
