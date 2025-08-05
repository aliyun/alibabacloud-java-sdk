// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPriorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyControlPolicyPriorityResponseBody body;

    public static ModifyControlPolicyPriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPriorityResponse self = new ModifyControlPolicyPriorityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyControlPolicyPriorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyControlPolicyPriorityResponse setBody(ModifyControlPolicyPriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyControlPolicyPriorityResponseBody getBody() {
        return this.body;
    }

}
