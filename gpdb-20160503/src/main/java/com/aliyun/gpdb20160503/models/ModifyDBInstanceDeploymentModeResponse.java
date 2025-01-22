// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeploymentModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceDeploymentModeResponseBody body;

    public static ModifyDBInstanceDeploymentModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDeploymentModeResponse self = new ModifyDBInstanceDeploymentModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDeploymentModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDeploymentModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceDeploymentModeResponse setBody(ModifyDBInstanceDeploymentModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDeploymentModeResponseBody getBody() {
        return this.body;
    }

}
