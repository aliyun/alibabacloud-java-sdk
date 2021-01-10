// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBImportTaskResponseBody body;

    public static CreateDBImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBImportTaskResponse self = new CreateDBImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBImportTaskResponse setBody(CreateDBImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBImportTaskResponseBody getBody() {
        return this.body;
    }

}
