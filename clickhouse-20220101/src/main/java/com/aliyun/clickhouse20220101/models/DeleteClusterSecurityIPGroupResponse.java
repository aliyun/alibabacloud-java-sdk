// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteClusterSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClusterSecurityIPGroupResponseBody body;

    public static DeleteClusterSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterSecurityIPGroupResponse self = new DeleteClusterSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClusterSecurityIPGroupResponse setBody(DeleteClusterSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
