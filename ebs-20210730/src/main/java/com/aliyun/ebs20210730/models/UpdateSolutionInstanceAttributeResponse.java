// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateSolutionInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSolutionInstanceAttributeResponseBody body;

    public static UpdateSolutionInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionInstanceAttributeResponse self = new UpdateSolutionInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSolutionInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSolutionInstanceAttributeResponse setBody(UpdateSolutionInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSolutionInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
