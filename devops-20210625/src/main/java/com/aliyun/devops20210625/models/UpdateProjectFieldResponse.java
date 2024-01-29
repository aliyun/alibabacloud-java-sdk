// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectFieldResponseBody body;

    public static UpdateProjectFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectFieldResponse self = new UpdateProjectFieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectFieldResponse setBody(UpdateProjectFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectFieldResponseBody getBody() {
        return this.body;
    }

}
