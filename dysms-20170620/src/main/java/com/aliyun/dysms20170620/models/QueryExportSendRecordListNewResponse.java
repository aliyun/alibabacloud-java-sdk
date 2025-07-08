// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryExportSendRecordListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExportSendRecordListNewResponseBody body;

    public static QueryExportSendRecordListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExportSendRecordListNewResponse self = new QueryExportSendRecordListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryExportSendRecordListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExportSendRecordListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExportSendRecordListNewResponse setBody(QueryExportSendRecordListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExportSendRecordListNewResponseBody getBody() {
        return this.body;
    }

}
