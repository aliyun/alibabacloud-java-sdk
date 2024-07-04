// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScriptResponseBody body;

    public static DeleteScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptResponse self = new DeleteScriptResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScriptResponse setBody(DeleteScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScriptResponseBody getBody() {
        return this.body;
    }

}
