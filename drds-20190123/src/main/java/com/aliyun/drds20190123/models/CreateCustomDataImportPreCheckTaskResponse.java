// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportPreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomDataImportPreCheckTaskResponseBody body;

    public static CreateCustomDataImportPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportPreCheckTaskResponse self = new CreateCustomDataImportPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportPreCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDataImportPreCheckTaskResponse setBody(CreateCustomDataImportPreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomDataImportPreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
