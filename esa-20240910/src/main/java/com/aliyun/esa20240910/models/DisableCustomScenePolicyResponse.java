// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DisableCustomScenePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCustomScenePolicyResponseBody body;

    public static DisableCustomScenePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomScenePolicyResponse self = new DisableCustomScenePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableCustomScenePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCustomScenePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCustomScenePolicyResponse setBody(DisableCustomScenePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCustomScenePolicyResponseBody getBody() {
        return this.body;
    }

}
