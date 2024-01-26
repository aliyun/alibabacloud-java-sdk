// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyADConnectorDirectoryResponseBody body;

    public static ModifyADConnectorDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorDirectoryResponse self = new ModifyADConnectorDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyADConnectorDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyADConnectorDirectoryResponse setBody(ModifyADConnectorDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyADConnectorDirectoryResponseBody getBody() {
        return this.body;
    }

}
