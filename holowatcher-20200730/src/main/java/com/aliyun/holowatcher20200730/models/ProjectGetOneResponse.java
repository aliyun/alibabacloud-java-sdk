// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectGetOneResponseBody body;

    public static ProjectGetOneResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetOneResponse self = new ProjectGetOneResponse();
        return TeaModel.build(map, self);
    }

    public ProjectGetOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectGetOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectGetOneResponse setBody(ProjectGetOneResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectGetOneResponseBody getBody() {
        return this.body;
    }

}
