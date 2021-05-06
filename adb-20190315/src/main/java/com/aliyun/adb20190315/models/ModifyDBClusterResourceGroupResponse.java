// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterResourceGroupResponseBody body;

    public static ModifyDBClusterResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResourceGroupResponse self = new ModifyDBClusterResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterResourceGroupResponse setBody(ModifyDBClusterResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterResourceGroupResponseBody getBody() {
        return this.body;
    }

}
