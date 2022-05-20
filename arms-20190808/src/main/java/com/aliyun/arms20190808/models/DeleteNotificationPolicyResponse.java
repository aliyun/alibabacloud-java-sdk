// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNotificationPolicyResponseBody body;

    public static DeleteNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationPolicyResponse self = new DeleteNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNotificationPolicyResponse setBody(DeleteNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
