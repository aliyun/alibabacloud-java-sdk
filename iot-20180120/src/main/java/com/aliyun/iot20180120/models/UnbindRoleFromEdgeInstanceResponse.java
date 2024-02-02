// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindRoleFromEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindRoleFromEdgeInstanceResponseBody body;

    public static UnbindRoleFromEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindRoleFromEdgeInstanceResponse self = new UnbindRoleFromEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindRoleFromEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindRoleFromEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindRoleFromEdgeInstanceResponse setBody(UnbindRoleFromEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindRoleFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
