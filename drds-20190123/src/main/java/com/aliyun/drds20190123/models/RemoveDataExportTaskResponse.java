// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDataExportTaskResponseBody body;

    public static RemoveDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataExportTaskResponse self = new RemoveDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataExportTaskResponse setBody(RemoveDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
