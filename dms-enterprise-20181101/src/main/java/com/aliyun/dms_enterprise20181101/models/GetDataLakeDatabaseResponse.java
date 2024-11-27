// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataLakeDatabaseResponseBody body;

    public static GetDataLakeDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeDatabaseResponse self = new GetDataLakeDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetDataLakeDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataLakeDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataLakeDatabaseResponse setBody(GetDataLakeDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataLakeDatabaseResponseBody getBody() {
        return this.body;
    }

}
