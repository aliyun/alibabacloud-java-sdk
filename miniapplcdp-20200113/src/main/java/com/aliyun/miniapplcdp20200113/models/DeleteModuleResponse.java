// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModuleResponseBody body;

    public static DeleteModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModuleResponse self = new DeleteModuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModuleResponse setBody(DeleteModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModuleResponseBody getBody() {
        return this.body;
    }

}
