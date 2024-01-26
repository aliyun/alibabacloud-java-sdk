// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDesktopsPolicyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopsPolicyGroupResponse setBody(ModifyDesktopsPolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopsPolicyGroupResponseBody getBody() {
        return this.body;
    }

}
