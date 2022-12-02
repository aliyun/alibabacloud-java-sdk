// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSetupProjectResponseBody body;

    public static UpdateSetupProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupProjectResponse self = new UpdateSetupProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSetupProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSetupProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSetupProjectResponse setBody(UpdateSetupProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSetupProjectResponseBody getBody() {
        return this.body;
    }

}
