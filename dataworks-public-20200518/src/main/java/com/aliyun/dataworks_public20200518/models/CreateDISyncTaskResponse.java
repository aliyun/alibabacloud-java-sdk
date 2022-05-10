// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDISyncTaskResponseBody body;

    public static CreateDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskResponse self = new CreateDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDISyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDISyncTaskResponse setBody(CreateDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
