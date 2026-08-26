// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServerIdeInstanceResponseBody body;

    public static CreateServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServerIdeInstanceResponse self = new CreateServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServerIdeInstanceResponse setBody(CreateServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
