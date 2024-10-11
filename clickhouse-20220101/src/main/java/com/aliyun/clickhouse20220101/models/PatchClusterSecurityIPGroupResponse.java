// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class PatchClusterSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PatchClusterSecurityIPGroupResponseBody body;

    public static PatchClusterSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PatchClusterSecurityIPGroupResponse self = new PatchClusterSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public PatchClusterSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PatchClusterSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PatchClusterSecurityIPGroupResponse setBody(PatchClusterSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PatchClusterSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
