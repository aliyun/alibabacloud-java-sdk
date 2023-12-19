// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePolicyV2ResponseBody body;

    public static CreatePolicyV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyV2Response self = new CreatePolicyV2Response();
        return TeaModel.build(map, self);
    }

    public CreatePolicyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicyV2Response setBody(CreatePolicyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyV2ResponseBody getBody() {
        return this.body;
    }

}
