// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUsageDetailDataExportTaskResponseBody body;

    public static CreateUsageDetailDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUsageDetailDataExportTaskResponse self = new CreateUsageDetailDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUsageDetailDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUsageDetailDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUsageDetailDataExportTaskResponse setBody(CreateUsageDetailDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
