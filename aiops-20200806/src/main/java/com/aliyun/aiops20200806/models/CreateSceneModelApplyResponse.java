// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateSceneModelApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSceneModelApplyResponseBody body;

    public static CreateSceneModelApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneModelApplyResponse self = new CreateSceneModelApplyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneModelApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneModelApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSceneModelApplyResponse setBody(CreateSceneModelApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneModelApplyResponseBody getBody() {
        return this.body;
    }

}
