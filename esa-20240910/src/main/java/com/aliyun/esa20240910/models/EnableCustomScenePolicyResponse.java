// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EnableCustomScenePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCustomScenePolicyResponseBody body;

    public static EnableCustomScenePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomScenePolicyResponse self = new EnableCustomScenePolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableCustomScenePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCustomScenePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCustomScenePolicyResponse setBody(EnableCustomScenePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCustomScenePolicyResponseBody getBody() {
        return this.body;
    }

}
