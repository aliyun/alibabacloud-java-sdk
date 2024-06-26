// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRepositoryResponseBody body;

    public static UpdateRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryResponse self = new UpdateRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRepositoryResponse setBody(UpdateRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepositoryResponseBody getBody() {
        return this.body;
    }

}
