// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectLabelResponseBody body;

    public static UpdateProjectLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectLabelResponse self = new UpdateProjectLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectLabelResponse setBody(UpdateProjectLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectLabelResponseBody getBody() {
        return this.body;
    }

}
