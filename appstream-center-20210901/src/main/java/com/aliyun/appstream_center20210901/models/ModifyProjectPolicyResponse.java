// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyProjectPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProjectPolicyResponseBody body;

    public static ModifyProjectPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectPolicyResponse self = new ModifyProjectPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProjectPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProjectPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProjectPolicyResponse setBody(ModifyProjectPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProjectPolicyResponseBody getBody() {
        return this.body;
    }

}
