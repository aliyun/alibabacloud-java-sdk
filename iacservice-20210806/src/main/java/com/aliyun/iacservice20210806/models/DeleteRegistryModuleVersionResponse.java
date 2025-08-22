// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryModuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegistryModuleVersionResponseBody body;

    public static DeleteRegistryModuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryModuleVersionResponse self = new DeleteRegistryModuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryModuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistryModuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegistryModuleVersionResponse setBody(DeleteRegistryModuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistryModuleVersionResponseBody getBody() {
        return this.body;
    }

}
