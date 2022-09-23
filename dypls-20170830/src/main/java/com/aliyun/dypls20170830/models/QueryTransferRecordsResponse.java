// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryTransferRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTransferRecordsResponseBody body;

    public static QueryTransferRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferRecordsResponse self = new QueryTransferRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransferRecordsResponse setBody(QueryTransferRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferRecordsResponseBody getBody() {
        return this.body;
    }

}
