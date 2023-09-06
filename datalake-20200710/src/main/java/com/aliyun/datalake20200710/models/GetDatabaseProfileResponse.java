// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatabaseProfileResponseBody body;

    public static GetDatabaseProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseProfileResponse self = new GetDatabaseProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseProfileResponse setBody(GetDatabaseProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseProfileResponseBody getBody() {
        return this.body;
    }

}
