// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalDatabaseResponseBody body;

    public static GetPhysicalDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseResponse self = new GetPhysicalDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalDatabaseResponse setBody(GetPhysicalDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalDatabaseResponseBody getBody() {
        return this.body;
    }

}
