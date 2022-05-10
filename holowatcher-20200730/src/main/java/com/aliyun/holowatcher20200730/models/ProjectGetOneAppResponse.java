// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetOneAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectGetOneAppResponseBody body;

    public static ProjectGetOneAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetOneAppResponse self = new ProjectGetOneAppResponse();
        return TeaModel.build(map, self);
    }

    public ProjectGetOneAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectGetOneAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectGetOneAppResponse setBody(ProjectGetOneAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectGetOneAppResponseBody getBody() {
        return this.body;
    }

}
