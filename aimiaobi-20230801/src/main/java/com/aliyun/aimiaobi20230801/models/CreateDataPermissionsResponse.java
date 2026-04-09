// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDataPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataPermissionsResponseBody body;

    public static CreateDataPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPermissionsResponse self = new CreateDataPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataPermissionsResponse setBody(CreateDataPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataPermissionsResponseBody getBody() {
        return this.body;
    }

}
