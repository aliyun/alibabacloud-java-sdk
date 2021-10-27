// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDataImportTaskResponseBody body;

    public static StopDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataImportTaskResponse self = new StopDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataImportTaskResponse setBody(StopDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
