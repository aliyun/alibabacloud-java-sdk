// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateProjectProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProjectProgressResponseBody body;

    public static UpdateProjectProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectProgressResponse self = new UpdateProjectProgressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectProgressResponse setBody(UpdateProjectProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectProgressResponseBody getBody() {
        return this.body;
    }

}
