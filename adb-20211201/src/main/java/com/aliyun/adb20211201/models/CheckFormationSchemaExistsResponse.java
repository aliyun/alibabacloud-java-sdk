// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckFormationSchemaExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFormationSchemaExistsResponseBody body;

    public static CheckFormationSchemaExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFormationSchemaExistsResponse self = new CheckFormationSchemaExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckFormationSchemaExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFormationSchemaExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFormationSchemaExistsResponse setBody(CheckFormationSchemaExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFormationSchemaExistsResponseBody getBody() {
        return this.body;
    }

}
