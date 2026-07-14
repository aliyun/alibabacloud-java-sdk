// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNotifyPolicyResponseBody body;

    public static DeleteNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotifyPolicyResponse self = new DeleteNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNotifyPolicyResponse setBody(DeleteNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
