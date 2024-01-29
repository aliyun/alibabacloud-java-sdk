// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkitemFieldResponseBody body;

    public static UpdateWorkitemFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemFieldResponse self = new UpdateWorkitemFieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkitemFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkitemFieldResponse setBody(UpdateWorkitemFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkitemFieldResponseBody getBody() {
        return this.body;
    }

}
