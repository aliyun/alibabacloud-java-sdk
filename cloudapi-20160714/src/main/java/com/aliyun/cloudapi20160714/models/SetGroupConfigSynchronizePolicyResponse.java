// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupConfigSynchronizePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGroupConfigSynchronizePolicyResponseBody body;

    public static SetGroupConfigSynchronizePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupConfigSynchronizePolicyResponse self = new SetGroupConfigSynchronizePolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupConfigSynchronizePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupConfigSynchronizePolicyResponse setBody(SetGroupConfigSynchronizePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupConfigSynchronizePolicyResponseBody getBody() {
        return this.body;
    }

}
