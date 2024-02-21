// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlOptimizeAdviceResponseBody body;

    public static GetSqlOptimizeAdviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlOptimizeAdviceResponse self = new GetSqlOptimizeAdviceResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlOptimizeAdviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlOptimizeAdviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlOptimizeAdviceResponse setBody(GetSqlOptimizeAdviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlOptimizeAdviceResponseBody getBody() {
        return this.body;
    }

}
