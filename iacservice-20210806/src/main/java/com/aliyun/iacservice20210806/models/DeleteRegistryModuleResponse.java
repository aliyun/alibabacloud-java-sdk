// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegistryModuleResponseBody body;

    public static DeleteRegistryModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryModuleResponse self = new DeleteRegistryModuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistryModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegistryModuleResponse setBody(DeleteRegistryModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistryModuleResponseBody getBody() {
        return this.body;
    }

}
