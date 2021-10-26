// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddIpControlPolicyItemResponseBody body;

    public static AddIpControlPolicyItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpControlPolicyItemResponse self = new AddIpControlPolicyItemResponse();
        return TeaModel.build(map, self);
    }

    public AddIpControlPolicyItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpControlPolicyItemResponse setBody(AddIpControlPolicyItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpControlPolicyItemResponseBody getBody() {
        return this.body;
    }

}
