// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchExportResponseBody body;

    public static BatchExportResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchExportResponse self = new BatchExportResponse();
        return TeaModel.build(map, self);
    }

    public BatchExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchExportResponse setBody(BatchExportResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchExportResponseBody getBody() {
        return this.body;
    }

}
