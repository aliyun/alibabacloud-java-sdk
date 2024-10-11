// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class UpsertClusterSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertClusterSecurityIPGroupResponseBody body;

    public static UpsertClusterSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertClusterSecurityIPGroupResponse self = new UpsertClusterSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpsertClusterSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertClusterSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertClusterSecurityIPGroupResponse setBody(UpsertClusterSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertClusterSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
