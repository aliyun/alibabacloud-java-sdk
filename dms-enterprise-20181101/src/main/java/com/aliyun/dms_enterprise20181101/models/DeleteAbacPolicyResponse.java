// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAbacPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAbacPolicyResponseBody body;

    public static DeleteAbacPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbacPolicyResponse self = new DeleteAbacPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAbacPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAbacPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAbacPolicyResponse setBody(DeleteAbacPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAbacPolicyResponseBody getBody() {
        return this.body;
    }

}
