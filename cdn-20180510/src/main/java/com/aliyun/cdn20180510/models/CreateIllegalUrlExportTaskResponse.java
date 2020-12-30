// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateIllegalUrlExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIllegalUrlExportTaskResponseBody body;

    public static CreateIllegalUrlExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIllegalUrlExportTaskResponse self = new CreateIllegalUrlExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateIllegalUrlExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIllegalUrlExportTaskResponse setBody(CreateIllegalUrlExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIllegalUrlExportTaskResponseBody getBody() {
        return this.body;
    }

}
