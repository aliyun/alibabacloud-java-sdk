// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDagTestResponseBody body;

    public static CreateDagTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDagTestResponse self = new CreateDagTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateDagTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDagTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDagTestResponse setBody(CreateDagTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDagTestResponseBody getBody() {
        return this.body;
    }

}
