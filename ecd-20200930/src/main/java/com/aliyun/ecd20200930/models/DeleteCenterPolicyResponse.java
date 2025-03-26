// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCenterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCenterPolicyResponseBody body;

    public static DeleteCenterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenterPolicyResponse self = new DeleteCenterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenterPolicyResponse setBody(DeleteCenterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenterPolicyResponseBody getBody() {
        return this.body;
    }

}
