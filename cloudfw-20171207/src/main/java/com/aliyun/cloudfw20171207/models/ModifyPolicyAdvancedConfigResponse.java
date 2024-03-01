// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPolicyAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolicyAdvancedConfigResponseBody body;

    public static ModifyPolicyAdvancedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyAdvancedConfigResponse self = new ModifyPolicyAdvancedConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyAdvancedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyAdvancedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolicyAdvancedConfigResponse setBody(ModifyPolicyAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
