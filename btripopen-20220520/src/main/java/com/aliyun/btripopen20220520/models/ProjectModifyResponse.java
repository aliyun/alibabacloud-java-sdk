// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectModifyResponseBody body;

    public static ProjectModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectModifyResponse self = new ProjectModifyResponse();
        return TeaModel.build(map, self);
    }

    public ProjectModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectModifyResponse setBody(ProjectModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectModifyResponseBody getBody() {
        return this.body;
    }

}
