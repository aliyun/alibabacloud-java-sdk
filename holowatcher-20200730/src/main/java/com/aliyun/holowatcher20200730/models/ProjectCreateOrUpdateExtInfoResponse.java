// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOrUpdateExtInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectCreateOrUpdateExtInfoResponseBody body;

    public static ProjectCreateOrUpdateExtInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOrUpdateExtInfoResponse self = new ProjectCreateOrUpdateExtInfoResponse();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOrUpdateExtInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectCreateOrUpdateExtInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProjectCreateOrUpdateExtInfoResponse setBody(ProjectCreateOrUpdateExtInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectCreateOrUpdateExtInfoResponseBody getBody() {
        return this.body;
    }

}
