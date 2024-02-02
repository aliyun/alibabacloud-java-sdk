// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteOTAModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOTAModuleResponseBody body;

    public static DeleteOTAModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOTAModuleResponse self = new DeleteOTAModuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOTAModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOTAModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOTAModuleResponse setBody(DeleteOTAModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOTAModuleResponseBody getBody() {
        return this.body;
    }

}
