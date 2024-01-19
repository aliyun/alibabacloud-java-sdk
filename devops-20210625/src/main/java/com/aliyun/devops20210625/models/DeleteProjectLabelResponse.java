// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProjectLabelResponseBody body;

    public static DeleteProjectLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectLabelResponse self = new DeleteProjectLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectLabelResponse setBody(DeleteProjectLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectLabelResponseBody getBody() {
        return this.body;
    }

}
