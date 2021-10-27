// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomDataExportTaskResponseBody body;

    public static CreateCustomDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportTaskResponse self = new CreateCustomDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDataExportTaskResponse setBody(CreateCustomDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
