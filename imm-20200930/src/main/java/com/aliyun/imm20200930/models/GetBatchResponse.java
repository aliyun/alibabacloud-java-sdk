// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchResponseBody body;

    public static GetBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchResponse self = new GetBatchResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchResponse setBody(GetBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchResponseBody getBody() {
        return this.body;
    }

}
