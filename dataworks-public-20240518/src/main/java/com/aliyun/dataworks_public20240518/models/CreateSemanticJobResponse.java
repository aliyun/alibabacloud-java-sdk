// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSemanticJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSemanticJobResponseBody body;

    public static CreateSemanticJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSemanticJobResponse self = new CreateSemanticJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSemanticJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSemanticJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSemanticJobResponse setBody(CreateSemanticJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSemanticJobResponseBody getBody() {
        return this.body;
    }

}
