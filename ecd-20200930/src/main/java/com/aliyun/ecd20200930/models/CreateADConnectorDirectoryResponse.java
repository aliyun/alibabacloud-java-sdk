// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateADConnectorDirectoryResponse setBody(CreateADConnectorDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateADConnectorDirectoryResponseBody getBody() {
        return this.body;
    }

}
