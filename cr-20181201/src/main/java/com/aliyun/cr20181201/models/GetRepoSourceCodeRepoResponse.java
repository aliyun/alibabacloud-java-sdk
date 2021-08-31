// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSourceCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoSourceCodeRepoResponseBody body;

    public static GetRepoSourceCodeRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSourceCodeRepoResponse self = new GetRepoSourceCodeRepoResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoSourceCodeRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoSourceCodeRepoResponse setBody(GetRepoSourceCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

}
