// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteScriptHotWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScriptHotWordResponseBody body;

    public static DeleteScriptHotWordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptHotWordResponse self = new DeleteScriptHotWordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScriptHotWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScriptHotWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScriptHotWordResponse setBody(DeleteScriptHotWordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScriptHotWordResponseBody getBody() {
        return this.body;
    }

}
