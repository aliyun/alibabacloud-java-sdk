// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterServiceConfigResponseBody body;

    public static ModifyClusterServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterServiceConfigResponse self = new ModifyClusterServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterServiceConfigResponse setBody(ModifyClusterServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterServiceConfigResponseBody getBody() {
        return this.body;
    }

}
