// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBResourceGroupResponseBody body;

    public static ModifyDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupResponse self = new ModifyDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBResourceGroupResponse setBody(ModifyDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
