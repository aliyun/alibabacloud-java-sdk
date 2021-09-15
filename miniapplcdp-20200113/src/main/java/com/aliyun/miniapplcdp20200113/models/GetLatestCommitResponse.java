// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLatestCommitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLatestCommitResponseBody body;

    public static GetLatestCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestCommitResponse self = new GetLatestCommitResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestCommitResponse setBody(GetLatestCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestCommitResponseBody getBody() {
        return this.body;
    }

}
