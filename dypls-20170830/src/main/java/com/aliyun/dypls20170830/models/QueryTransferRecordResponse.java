// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryTransferRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTransferRecordResponseBody body;

    public static QueryTransferRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferRecordResponse self = new QueryTransferRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransferRecordResponse setBody(QueryTransferRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferRecordResponseBody getBody() {
        return this.body;
    }

}
