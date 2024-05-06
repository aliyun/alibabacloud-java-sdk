// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyRestartClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRestartClusterResponseBody body;

    public static ModifyRestartClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRestartClusterResponse self = new ModifyRestartClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRestartClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRestartClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRestartClusterResponse setBody(ModifyRestartClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRestartClusterResponseBody getBody() {
        return this.body;
    }

}
