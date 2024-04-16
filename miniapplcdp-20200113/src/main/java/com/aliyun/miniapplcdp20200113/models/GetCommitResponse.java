// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetCommitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommitResponseBody body;

    public static GetCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommitResponse self = new GetCommitResponse();
        return TeaModel.build(map, self);
    }

    public GetCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommitResponse setBody(GetCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommitResponseBody getBody() {
        return this.body;
    }

}
