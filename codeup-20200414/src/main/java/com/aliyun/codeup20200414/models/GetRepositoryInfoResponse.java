// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepositoryInfoResponseBody body;

    public static GetRepositoryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryInfoResponse self = new GetRepositoryInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRepositoryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepositoryInfoResponse setBody(GetRepositoryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepositoryInfoResponseBody getBody() {
        return this.body;
    }

}
