// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteAutoScaleInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAutoScaleInstancePolicyResponseBody body;

    public static DeleteAutoScaleInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScaleInstancePolicyResponse self = new DeleteAutoScaleInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScaleInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoScaleInstancePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoScaleInstancePolicyResponse setBody(DeleteAutoScaleInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoScaleInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
