// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class ProjectQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectQueryResponseBody body;

    public static ProjectQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectQueryResponse self = new ProjectQueryResponse();
        return TeaModel.build(map, self);
    }

    public ProjectQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectQueryResponse setBody(ProjectQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectQueryResponseBody getBody() {
        return this.body;
    }

}
