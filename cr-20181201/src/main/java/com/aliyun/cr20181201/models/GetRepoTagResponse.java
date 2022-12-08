// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public GetRepoTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoTagResponse setBody(GetRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagResponseBody getBody() {
        return this.body;
    }

}
