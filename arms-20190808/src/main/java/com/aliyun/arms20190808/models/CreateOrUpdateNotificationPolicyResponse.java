// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateNotificationPolicyResponseBody body;

    public static CreateOrUpdateNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateNotificationPolicyResponse self = new CreateOrUpdateNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateNotificationPolicyResponse setBody(CreateOrUpdateNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
