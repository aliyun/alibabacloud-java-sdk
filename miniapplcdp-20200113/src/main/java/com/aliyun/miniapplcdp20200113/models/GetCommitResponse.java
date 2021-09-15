// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetCommitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCommitResponse setBody(GetCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommitResponseBody getBody() {
        return this.body;
    }

}
