// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCommonCustInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommonCustInfoResponseBody body;

    public static QueryCommonCustInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonCustInfoResponse self = new QueryCommonCustInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommonCustInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommonCustInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommonCustInfoResponse setBody(QueryCommonCustInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommonCustInfoResponseBody getBody() {
        return this.body;
    }

}
