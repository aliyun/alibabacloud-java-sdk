// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetStatusAndOssResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProjectGetStatusAndOssResponseBody body;

    public static ProjectGetStatusAndOssResponse build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetStatusAndOssResponse self = new ProjectGetStatusAndOssResponse();
        return TeaModel.build(map, self);
    }

    public ProjectGetStatusAndOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProjectGetStatusAndOssResponse setBody(ProjectGetStatusAndOssResponseBody body) {
        this.body = body;
        return this;
    }
    public ProjectGetStatusAndOssResponseBody getBody() {
        return this.body;
    }

}
