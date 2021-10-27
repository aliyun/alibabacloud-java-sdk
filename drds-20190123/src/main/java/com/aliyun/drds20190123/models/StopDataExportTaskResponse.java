// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDataExportTaskResponseBody body;

    public static StopDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataExportTaskResponse self = new StopDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataExportTaskResponse setBody(StopDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
