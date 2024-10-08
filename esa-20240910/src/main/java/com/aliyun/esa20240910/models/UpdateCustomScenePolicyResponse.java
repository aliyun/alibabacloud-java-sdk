// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomScenePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomScenePolicyResponseBody body;

    public static UpdateCustomScenePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomScenePolicyResponse self = new UpdateCustomScenePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomScenePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomScenePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomScenePolicyResponse setBody(UpdateCustomScenePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomScenePolicyResponseBody getBody() {
        return this.body;
    }

}
