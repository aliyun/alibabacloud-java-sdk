// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyInvokeSatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVerifyInvokeSatisticResponseBody body;

    public static QueryVerifyInvokeSatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyInvokeSatisticResponse self = new QueryVerifyInvokeSatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryVerifyInvokeSatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVerifyInvokeSatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVerifyInvokeSatisticResponse setBody(QueryVerifyInvokeSatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVerifyInvokeSatisticResponseBody getBody() {
        return this.body;
    }

}
