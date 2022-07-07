// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetContractProgressResponseBody body;

    public static GetContractProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractProgressResponse self = new GetContractProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetContractProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContractProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContractProgressResponse setBody(GetContractProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContractProgressResponseBody getBody() {
        return this.body;
    }

}
