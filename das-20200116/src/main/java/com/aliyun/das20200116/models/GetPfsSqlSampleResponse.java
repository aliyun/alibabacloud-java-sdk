// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPfsSqlSampleResponseBody body;

    public static GetPfsSqlSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSampleResponse self = new GetPfsSqlSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPfsSqlSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPfsSqlSampleResponse setBody(GetPfsSqlSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPfsSqlSampleResponseBody getBody() {
        return this.body;
    }

}
