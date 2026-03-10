// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoryHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryHistoryResponseBody body;

    public static GetMemoryHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryHistoryResponse self = new GetMemoryHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryHistoryResponse setBody(GetMemoryHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryHistoryResponseBody getBody() {
        return this.body;
    }

}
