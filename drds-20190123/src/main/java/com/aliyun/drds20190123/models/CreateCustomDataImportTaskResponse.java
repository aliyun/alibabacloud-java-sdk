// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomDataImportTaskResponseBody body;

    public static CreateCustomDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportTaskResponse self = new CreateCustomDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDataImportTaskResponse setBody(CreateCustomDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
