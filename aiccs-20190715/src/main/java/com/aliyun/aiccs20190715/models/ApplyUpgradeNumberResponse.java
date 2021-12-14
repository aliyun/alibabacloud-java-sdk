// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyUpgradeNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyUpgradeNumberResponseBody body;

    public static ApplyUpgradeNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyUpgradeNumberResponse self = new ApplyUpgradeNumberResponse();
        return TeaModel.build(map, self);
    }

    public ApplyUpgradeNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyUpgradeNumberResponse setBody(ApplyUpgradeNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyUpgradeNumberResponseBody getBody() {
        return this.body;
    }

}
