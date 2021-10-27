// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportPreCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomDataExportPreCheckTaskResponseBody body;

    public static CreateCustomDataExportPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportPreCheckTaskResponse self = new CreateCustomDataExportPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportPreCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDataExportPreCheckTaskResponse setBody(CreateCustomDataExportPreCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomDataExportPreCheckTaskResponseBody getBody() {
        return this.body;
    }

}
