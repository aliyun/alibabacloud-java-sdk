// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventRecordPlansResponseBody body;

    public static QueryEventRecordPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlansResponse self = new QueryEventRecordPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventRecordPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventRecordPlansResponse setBody(QueryEventRecordPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlansResponseBody getBody() {
        return this.body;
    }

}
