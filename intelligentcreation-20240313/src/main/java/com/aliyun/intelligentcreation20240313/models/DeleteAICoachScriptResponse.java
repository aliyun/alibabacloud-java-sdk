// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteAICoachScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAICoachScriptResponseBody body;

    public static DeleteAICoachScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAICoachScriptResponse self = new DeleteAICoachScriptResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAICoachScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAICoachScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAICoachScriptResponse setBody(DeleteAICoachScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAICoachScriptResponseBody getBody() {
        return this.body;
    }

}
