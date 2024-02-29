// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagComplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDagComplementResponseBody body;

    public static CreateDagComplementResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDagComplementResponse self = new CreateDagComplementResponse();
        return TeaModel.build(map, self);
    }

    public CreateDagComplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDagComplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDagComplementResponse setBody(CreateDagComplementResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDagComplementResponseBody getBody() {
        return this.body;
    }

}
