// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneDefensePolicyResponseBody body;

    public static DeleteSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneDefensePolicyResponse self = new DeleteSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneDefensePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneDefensePolicyResponse setBody(DeleteSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
