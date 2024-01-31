// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProjectAddResponseBody body;

    public static ProjectAddResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectAddResponse self = new ProjectAddResponse();
        return TeaModel.build(map, self);
    }

    public ProjectAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectAddResponse setBody(ProjectAddResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectAddResponseBody getBody() {
        return this.body;
    }

}
