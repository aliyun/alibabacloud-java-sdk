// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolicyV2ResponseBody body;

    public static UpdatePolicyV2Response build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyV2Response self = new UpdatePolicyV2Response();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolicyV2Response setBody(UpdatePolicyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicyV2ResponseBody getBody() {
        return this.body;
    }

}
