// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlEditorHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlEditorHistoryResponseBody body;

    public static DescribeSqlEditorHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlEditorHistoryResponse self = new DescribeSqlEditorHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlEditorHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlEditorHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlEditorHistoryResponse setBody(DescribeSqlEditorHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlEditorHistoryResponseBody getBody() {
        return this.body;
    }

}
