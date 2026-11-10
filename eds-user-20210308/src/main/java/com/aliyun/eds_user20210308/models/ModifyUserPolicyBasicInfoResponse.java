// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyUserPolicyBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserPolicyBasicInfoResponseBody body;

    public static ModifyUserPolicyBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPolicyBasicInfoResponse self = new ModifyUserPolicyBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserPolicyBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserPolicyBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserPolicyBasicInfoResponse setBody(ModifyUserPolicyBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserPolicyBasicInfoResponseBody getBody() {
        return this.body;
    }

}
