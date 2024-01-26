// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateADConnectorDirectoryResponseBody body;

    public static CreateADConnectorDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorDirectoryResponse self = new CreateADConnectorDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateADConnectorDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateADConnectorDirectoryResponse setBody(CreateADConnectorDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateADConnectorDirectoryResponseBody getBody() {
        return this.body;
    }

}
