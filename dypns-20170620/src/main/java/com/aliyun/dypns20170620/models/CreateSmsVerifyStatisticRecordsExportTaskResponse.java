// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateSmsVerifyStatisticRecordsExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsVerifyStatisticRecordsExportTaskResponseBody body;

    public static CreateSmsVerifyStatisticRecordsExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsVerifyStatisticRecordsExportTaskResponse self = new CreateSmsVerifyStatisticRecordsExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsVerifyStatisticRecordsExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskResponse setBody(CreateSmsVerifyStatisticRecordsExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsVerifyStatisticRecordsExportTaskResponseBody getBody() {
        return this.body;
    }

}
