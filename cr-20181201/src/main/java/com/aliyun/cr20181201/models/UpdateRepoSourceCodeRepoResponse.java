// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateRepoSourceCodeRepoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRepoSourceCodeRepoResponse setBody(UpdateRepoSourceCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

}
