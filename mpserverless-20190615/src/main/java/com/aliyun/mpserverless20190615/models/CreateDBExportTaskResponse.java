// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBExportTaskResponseBody body;

    public static CreateDBExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBExportTaskResponse self = new CreateDBExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBExportTaskResponse setBody(CreateDBExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBExportTaskResponseBody getBody() {
        return this.body;
    }

}
