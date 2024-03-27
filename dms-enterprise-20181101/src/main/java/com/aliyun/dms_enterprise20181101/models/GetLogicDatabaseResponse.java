// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogicDatabaseResponseBody body;

    public static GetLogicDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogicDatabaseResponse self = new GetLogicDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLogicDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogicDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogicDatabaseResponse setBody(GetLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
