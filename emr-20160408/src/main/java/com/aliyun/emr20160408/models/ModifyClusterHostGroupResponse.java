// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterHostGroupResponseBody body;

    public static ModifyClusterHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterHostGroupResponse self = new ModifyClusterHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterHostGroupResponse setBody(ModifyClusterHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterHostGroupResponseBody getBody() {
        return this.body;
    }

}
