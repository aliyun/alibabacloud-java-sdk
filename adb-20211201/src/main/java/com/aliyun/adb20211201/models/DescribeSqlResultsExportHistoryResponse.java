// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlResultsExportHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlResultsExportHistoryResponseBody body;

    public static DescribeSqlResultsExportHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlResultsExportHistoryResponse self = new DescribeSqlResultsExportHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlResultsExportHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlResultsExportHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlResultsExportHistoryResponse setBody(DescribeSqlResultsExportHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlResultsExportHistoryResponseBody getBody() {
        return this.body;
    }

}
