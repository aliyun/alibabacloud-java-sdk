// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindRoleToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindRoleToEdgeInstanceResponseBody body;

    public static BindRoleToEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindRoleToEdgeInstanceResponse self = new BindRoleToEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindRoleToEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindRoleToEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindRoleToEdgeInstanceResponse setBody(BindRoleToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindRoleToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
