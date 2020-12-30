// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUsageDetailDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUsageDetailDataExportTaskResponseBody body;

    public static DeleteUsageDetailDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsageDetailDataExportTaskResponse self = new DeleteUsageDetailDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUsageDetailDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUsageDetailDataExportTaskResponse setBody(DeleteUsageDetailDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
