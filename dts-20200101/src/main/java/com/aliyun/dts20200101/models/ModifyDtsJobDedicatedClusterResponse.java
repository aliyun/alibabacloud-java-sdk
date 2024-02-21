// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobDedicatedClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobDedicatedClusterResponseBody body;

    public static ModifyDtsJobDedicatedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobDedicatedClusterResponse self = new ModifyDtsJobDedicatedClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobDedicatedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobDedicatedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobDedicatedClusterResponse setBody(ModifyDtsJobDedicatedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobDedicatedClusterResponseBody getBody() {
        return this.body;
    }

}
