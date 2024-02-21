// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateReadWritePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateReadWritePolicyResponseBody body;

    public static UpdateReadWritePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadWritePolicyResponse self = new UpdateReadWritePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReadWritePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReadWritePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateReadWritePolicyResponse setBody(UpdateReadWritePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReadWritePolicyResponseBody getBody() {
        return this.body;
    }

}
