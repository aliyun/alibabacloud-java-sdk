// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class UpdateSourcingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSourcingProjectResponseBody body;

    public static UpdateSourcingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourcingProjectResponse self = new UpdateSourcingProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSourcingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSourcingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSourcingProjectResponse setBody(UpdateSourcingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSourcingProjectResponseBody getBody() {
        return this.body;
    }

}
