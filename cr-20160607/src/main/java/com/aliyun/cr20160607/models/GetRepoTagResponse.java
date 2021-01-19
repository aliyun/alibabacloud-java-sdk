// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoTagResponseBody body;

    public static GetRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagResponse self = new GetRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoTagResponse setBody(GetRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagResponseBody getBody() {
        return this.body;
    }

}
