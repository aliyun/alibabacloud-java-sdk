// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOneAPPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectCreateOneAPPResponseBody body;

    public static ProjectCreateOneAPPResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOneAPPResponse self = new ProjectCreateOneAPPResponse();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOneAPPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectCreateOneAPPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectCreateOneAPPResponse setBody(ProjectCreateOneAPPResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectCreateOneAPPResponseBody getBody() {
        return this.body;
    }

}
