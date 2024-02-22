// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorGroupNotifyPolicyResponseBody body;

    public static CreateMonitorGroupNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyResponse self = new CreateMonitorGroupNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorGroupNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorGroupNotifyPolicyResponse setBody(CreateMonitorGroupNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorGroupNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
