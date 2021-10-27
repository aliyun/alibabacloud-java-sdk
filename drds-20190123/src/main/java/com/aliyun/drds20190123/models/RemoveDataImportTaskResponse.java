// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDataImportTaskResponseBody body;

    public static RemoveDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataImportTaskResponse self = new RemoveDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataImportTaskResponse setBody(RemoveDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
