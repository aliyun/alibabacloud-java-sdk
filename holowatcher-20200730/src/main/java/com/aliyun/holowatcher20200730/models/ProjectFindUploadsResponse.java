// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindUploadsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectFindUploadsResponseBody body;

    public static ProjectFindUploadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindUploadsResponse self = new ProjectFindUploadsResponse();
        return TeaModel.build(map, self);
    }

    public ProjectFindUploadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectFindUploadsResponse setBody(ProjectFindUploadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectFindUploadsResponseBody getBody() {
        return this.body;
    }

}
