// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMonitorGroupResponseBody body;

    public static ModifyMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupResponse self = new ModifyMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMonitorGroupResponse setBody(ModifyMonitorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMonitorGroupResponseBody getBody() {
        return this.body;
    }

}
