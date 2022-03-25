// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectFindAllResponseBody body;

    public static ProjectFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindAllResponse self = new ProjectFindAllResponse();
        return TeaModel.build(map, self);
    }

    public ProjectFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectFindAllResponse setBody(ProjectFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectFindAllResponseBody getBody() {
        return this.body;
    }

}
