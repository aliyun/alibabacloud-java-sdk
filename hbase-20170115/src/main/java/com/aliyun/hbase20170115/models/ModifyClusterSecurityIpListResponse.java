// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterSecurityIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterSecurityIpListResponseBody body;

    public static ModifyClusterSecurityIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterSecurityIpListResponse self = new ModifyClusterSecurityIpListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterSecurityIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterSecurityIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterSecurityIpListResponse setBody(ModifyClusterSecurityIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterSecurityIpListResponseBody getBody() {
        return this.body;
    }

}
