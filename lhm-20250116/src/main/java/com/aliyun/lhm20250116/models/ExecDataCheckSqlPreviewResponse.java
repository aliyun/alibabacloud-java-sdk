// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckSqlPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckSqlPreviewResponseBody body;

    public static ExecDataCheckSqlPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckSqlPreviewResponse self = new ExecDataCheckSqlPreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckSqlPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckSqlPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckSqlPreviewResponse setBody(ExecDataCheckSqlPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckSqlPreviewResponseBody getBody() {
        return this.body;
    }

}
