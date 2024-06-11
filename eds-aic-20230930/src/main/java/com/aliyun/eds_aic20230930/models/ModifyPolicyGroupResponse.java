// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolicyGroupResponseBody body;

    public static ModifyPolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupResponse self = new ModifyPolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolicyGroupResponse setBody(ModifyPolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyGroupResponseBody getBody() {
        return this.body;
    }

}
