// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCertUrlByApplyIdResponseBody body;

    public static QueryCertUrlByApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertUrlByApplyIdResponse self = new QueryCertUrlByApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertUrlByApplyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCertUrlByApplyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCertUrlByApplyIdResponse setBody(QueryCertUrlByApplyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCertUrlByApplyIdResponseBody getBody() {
        return this.body;
    }

}
