// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryReceiverByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReceiverByParamResponseBody body;

    public static QueryReceiverByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverByParamResponse self = new QueryReceiverByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryReceiverByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReceiverByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReceiverByParamResponse setBody(QueryReceiverByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReceiverByParamResponseBody getBody() {
        return this.body;
    }

}
