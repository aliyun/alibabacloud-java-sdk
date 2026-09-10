// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTableLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlTableLineageResponseBody body;

    public static GetSqlTableLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTableLineageResponse self = new GetSqlTableLineageResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlTableLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlTableLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlTableLineageResponse setBody(GetSqlTableLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlTableLineageResponseBody getBody() {
        return this.body;
    }

}
