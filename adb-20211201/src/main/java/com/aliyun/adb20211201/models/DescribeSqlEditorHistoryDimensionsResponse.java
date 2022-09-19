// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlEditorHistoryDimensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlEditorHistoryDimensionsResponseBody body;

    public static DescribeSqlEditorHistoryDimensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlEditorHistoryDimensionsResponse self = new DescribeSqlEditorHistoryDimensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlEditorHistoryDimensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlEditorHistoryDimensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlEditorHistoryDimensionsResponse setBody(DescribeSqlEditorHistoryDimensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlEditorHistoryDimensionsResponseBody getBody() {
        return this.body;
    }

}
