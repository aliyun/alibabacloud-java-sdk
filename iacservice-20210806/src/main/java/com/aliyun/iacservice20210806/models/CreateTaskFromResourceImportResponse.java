// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskFromResourceImportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskFromResourceImportResponseBody body;

    public static CreateTaskFromResourceImportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskFromResourceImportResponse self = new CreateTaskFromResourceImportResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskFromResourceImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskFromResourceImportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskFromResourceImportResponse setBody(CreateTaskFromResourceImportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskFromResourceImportResponseBody getBody() {
        return this.body;
    }

}
