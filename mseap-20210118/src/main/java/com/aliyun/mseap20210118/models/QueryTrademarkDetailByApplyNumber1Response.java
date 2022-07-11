// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumber1Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrademarkDetailByApplyNumber1ResponseBody body;

    public static QueryTrademarkDetailByApplyNumber1Response build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumber1Response self = new QueryTrademarkDetailByApplyNumber1Response();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumber1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkDetailByApplyNumber1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkDetailByApplyNumber1Response setBody(QueryTrademarkDetailByApplyNumber1ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkDetailByApplyNumber1ResponseBody getBody() {
        return this.body;
    }

}
