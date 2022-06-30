// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateFileJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFileJobResponseBody body;

    public static CreateFileJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileJobResponse self = new CreateFileJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileJobResponse setBody(CreateFileJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileJobResponseBody getBody() {
        return this.body;
    }

}
