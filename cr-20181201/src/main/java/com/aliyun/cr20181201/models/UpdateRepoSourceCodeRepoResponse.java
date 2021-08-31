// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRepoSourceCodeRepoResponseBody body;

    public static UpdateRepoSourceCodeRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoSourceCodeRepoResponse self = new UpdateRepoSourceCodeRepoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepoSourceCodeRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRepoSourceCodeRepoResponse setBody(UpdateRepoSourceCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

}
