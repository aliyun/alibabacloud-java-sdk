// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlComparisonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPfsSqlComparisonResponseBody body;

    public static GetPfsSqlComparisonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlComparisonResponse self = new GetPfsSqlComparisonResponse();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlComparisonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPfsSqlComparisonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPfsSqlComparisonResponse setBody(GetPfsSqlComparisonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPfsSqlComparisonResponseBody getBody() {
        return this.body;
    }

}
