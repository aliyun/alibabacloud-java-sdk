// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectResponseBody body;

    public static UpdateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponse self = new UpdateProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectResponse setBody(UpdateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectResponseBody getBody() {
        return this.body;
    }

}
