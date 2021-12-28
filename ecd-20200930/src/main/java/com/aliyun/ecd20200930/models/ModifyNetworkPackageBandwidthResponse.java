// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkPackageBandwidthResponseBody body;

    public static ModifyNetworkPackageBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageBandwidthResponse self = new ModifyNetworkPackageBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkPackageBandwidthResponse setBody(ModifyNetworkPackageBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkPackageBandwidthResponseBody getBody() {
        return this.body;
    }

}
