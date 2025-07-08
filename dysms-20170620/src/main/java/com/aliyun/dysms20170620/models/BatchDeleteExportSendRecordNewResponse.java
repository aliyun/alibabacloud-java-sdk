// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchDeleteExportSendRecordNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteExportSendRecordNewResponseBody body;

    public static BatchDeleteExportSendRecordNewResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteExportSendRecordNewResponse self = new BatchDeleteExportSendRecordNewResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteExportSendRecordNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteExportSendRecordNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteExportSendRecordNewResponse setBody(BatchDeleteExportSendRecordNewResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteExportSendRecordNewResponseBody getBody() {
        return this.body;
    }

}
