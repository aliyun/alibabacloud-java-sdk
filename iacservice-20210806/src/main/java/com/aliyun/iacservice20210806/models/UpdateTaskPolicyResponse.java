// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskPolicyResponseBody body;

    public static UpdateTaskPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskPolicyResponse self = new UpdateTaskPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskPolicyResponse setBody(UpdateTaskPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskPolicyResponseBody getBody() {
        return this.body;
    }

}
