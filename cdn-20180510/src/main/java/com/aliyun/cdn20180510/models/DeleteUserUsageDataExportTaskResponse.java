// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUserUsageDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserUsageDataExportTaskResponseBody body;

    public static DeleteUserUsageDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserUsageDataExportTaskResponse self = new DeleteUserUsageDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserUsageDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserUsageDataExportTaskResponse setBody(DeleteUserUsageDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
