// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebIpSetSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebIpSetSwitchResponseBody body;

    public static ModifyWebIpSetSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebIpSetSwitchResponse self = new ModifyWebIpSetSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebIpSetSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebIpSetSwitchResponse setBody(ModifyWebIpSetSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebIpSetSwitchResponseBody getBody() {
        return this.body;
    }

}
