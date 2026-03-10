// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoriesResponseBody body;

    public static GetMemoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoriesResponse self = new GetMemoriesResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoriesResponse setBody(GetMemoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoriesResponseBody getBody() {
        return this.body;
    }

}
