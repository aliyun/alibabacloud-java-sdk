// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticDatabaseResponseBody body;

    public static GetAgenticDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticDatabaseResponse self = new GetAgenticDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticDatabaseResponse setBody(GetAgenticDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticDatabaseResponseBody getBody() {
        return this.body;
    }

}
