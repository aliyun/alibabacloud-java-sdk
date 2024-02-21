// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceSqlOptimizeStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSqlOptimizeStatisticResponseBody body;

    public static GetInstanceSqlOptimizeStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSqlOptimizeStatisticResponse self = new GetInstanceSqlOptimizeStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSqlOptimizeStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSqlOptimizeStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSqlOptimizeStatisticResponse setBody(GetInstanceSqlOptimizeStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSqlOptimizeStatisticResponseBody getBody() {
        return this.body;
    }

}
