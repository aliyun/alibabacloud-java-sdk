// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileLastCommitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileLastCommitResponseBody body;

    public static GetFileLastCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileLastCommitResponse self = new GetFileLastCommitResponse();
        return TeaModel.build(map, self);
    }

    public GetFileLastCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileLastCommitResponse setBody(GetFileLastCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileLastCommitResponseBody getBody() {
        return this.body;
    }

}
