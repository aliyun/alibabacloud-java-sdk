// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolicyContentResponseBody body;

    public static ModifyPolicyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyContentResponse self = new ModifyPolicyContentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolicyContentResponse setBody(ModifyPolicyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyContentResponseBody getBody() {
        return this.body;
    }

}
