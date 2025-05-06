// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class DeletePromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePromptResponseBody body;

    public static DeletePromptResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptResponse self = new DeletePromptResponse();
        return TeaModel.build(map, self);
    }

    public DeletePromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePromptResponse setBody(DeletePromptResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePromptResponseBody getBody() {
        return this.body;
    }

}
