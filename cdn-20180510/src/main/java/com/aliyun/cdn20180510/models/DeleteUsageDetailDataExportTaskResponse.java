// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUsageDetailDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteUsageDetailDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUsageDetailDataExportTaskResponse setBody(DeleteUsageDetailDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
