// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteCodeInterpreterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCodeInterpreterResult body;

    public static DeleteCodeInterpreterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeInterpreterResponse self = new DeleteCodeInterpreterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCodeInterpreterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCodeInterpreterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCodeInterpreterResponse setBody(DeleteCodeInterpreterResult body) {
        this.body = body;
        return this;
    }
    public DeleteCodeInterpreterResult getBody() {
        return this.body;
    }

}
