// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterMaintainTimeResponseBody body;

    public static ModifyDBClusterMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponse self = new ModifyDBClusterMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMaintainTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterMaintainTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterMaintainTimeResponse setBody(ModifyDBClusterMaintainTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterMaintainTimeResponseBody getBody() {
        return this.body;
    }

}
