// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOrUpdateExtInfoAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectCreateOrUpdateExtInfoAppResponseBody body;

    public static ProjectCreateOrUpdateExtInfoAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOrUpdateExtInfoAppResponse self = new ProjectCreateOrUpdateExtInfoAppResponse();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOrUpdateExtInfoAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectCreateOrUpdateExtInfoAppResponse setBody(ProjectCreateOrUpdateExtInfoAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectCreateOrUpdateExtInfoAppResponseBody getBody() {
        return this.body;
    }

}
