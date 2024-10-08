// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomScenePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomScenePolicyResponseBody body;

    public static DeleteCustomScenePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomScenePolicyResponse self = new DeleteCustomScenePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomScenePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomScenePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomScenePolicyResponse setBody(DeleteCustomScenePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomScenePolicyResponseBody getBody() {
        return this.body;
    }

}
