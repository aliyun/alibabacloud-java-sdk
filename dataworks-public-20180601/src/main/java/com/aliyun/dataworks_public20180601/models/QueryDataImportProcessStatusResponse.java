// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataImportProcessStatusResponseBody body;

    public static QueryDataImportProcessStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessStatusResponse self = new QueryDataImportProcessStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataImportProcessStatusResponse setBody(QueryDataImportProcessStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataImportProcessStatusResponseBody getBody() {
        return this.body;
    }

}
