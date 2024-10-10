// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDIJobResponseBody body;

    public static CreateDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobResponse self = new CreateDIJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDIJobResponse setBody(CreateDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDIJobResponseBody getBody() {
        return this.body;
    }

}
