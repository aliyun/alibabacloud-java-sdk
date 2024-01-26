// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyNetworkPackageBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkPackageBandwidthResponse setBody(ModifyNetworkPackageBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkPackageBandwidthResponseBody getBody() {
        return this.body;
    }

}
