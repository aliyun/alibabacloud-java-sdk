// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAppIcpRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsAppIcpRecordResponseBody body;

    public static QuerySmsAppIcpRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAppIcpRecordResponse self = new QuerySmsAppIcpRecordResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsAppIcpRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsAppIcpRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsAppIcpRecordResponse setBody(QuerySmsAppIcpRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsAppIcpRecordResponseBody getBody() {
        return this.body;
    }

}
