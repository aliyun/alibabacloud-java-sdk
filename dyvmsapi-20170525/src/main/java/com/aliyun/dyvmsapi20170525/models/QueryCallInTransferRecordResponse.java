// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInTransferRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallInTransferRecordResponseBody body;

    public static QueryCallInTransferRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInTransferRecordResponse self = new QueryCallInTransferRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallInTransferRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallInTransferRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallInTransferRecordResponse setBody(QueryCallInTransferRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallInTransferRecordResponseBody getBody() {
        return this.body;
    }

}
