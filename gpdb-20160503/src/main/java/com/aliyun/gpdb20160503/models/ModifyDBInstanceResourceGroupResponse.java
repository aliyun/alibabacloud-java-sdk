// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceResourceGroupResponseBody body;

    public static ModifyDBInstanceResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceResourceGroupResponse self = new ModifyDBInstanceResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceResourceGroupResponse setBody(ModifyDBInstanceResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceResourceGroupResponseBody getBody() {
        return this.body;
    }

}
