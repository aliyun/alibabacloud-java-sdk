// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProjectDeleteResponseBody body;

    public static ProjectDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectDeleteResponse self = new ProjectDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ProjectDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectDeleteResponse setBody(ProjectDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectDeleteResponseBody getBody() {
        return this.body;
    }

}
