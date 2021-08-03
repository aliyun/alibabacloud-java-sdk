// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopsPolicyGroupResponseBody body;

    public static ModifyDesktopsPolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupResponse self = new ModifyDesktopsPolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopsPolicyGroupResponse setBody(ModifyDesktopsPolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopsPolicyGroupResponseBody getBody() {
        return this.body;
    }

}
