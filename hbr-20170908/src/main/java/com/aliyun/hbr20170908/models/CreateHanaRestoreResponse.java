// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaRestoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHanaRestoreResponseBody body;

    public static CreateHanaRestoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaRestoreResponse self = new CreateHanaRestoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateHanaRestoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHanaRestoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHanaRestoreResponse setBody(CreateHanaRestoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHanaRestoreResponseBody getBody() {
        return this.body;
    }

}
