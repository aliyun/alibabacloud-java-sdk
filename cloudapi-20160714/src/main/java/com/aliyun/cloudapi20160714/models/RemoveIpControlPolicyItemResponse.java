// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveIpControlPolicyItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveIpControlPolicyItemResponseBody body;

    public static RemoveIpControlPolicyItemResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlPolicyItemResponse self = new RemoveIpControlPolicyItemResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlPolicyItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIpControlPolicyItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveIpControlPolicyItemResponse setBody(RemoveIpControlPolicyItemResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIpControlPolicyItemResponseBody getBody() {
        return this.body;
    }

}
