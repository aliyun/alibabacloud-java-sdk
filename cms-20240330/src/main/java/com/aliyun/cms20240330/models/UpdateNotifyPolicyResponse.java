// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNotifyPolicyResponseBody body;

    public static UpdateNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotifyPolicyResponse self = new UpdateNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNotifyPolicyResponse setBody(UpdateNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
