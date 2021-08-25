// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ModifyIpStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpStatusResponseBody body;

    public static ModifyIpStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpStatusResponse self = new ModifyIpStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpStatusResponse setBody(ModifyIpStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpStatusResponseBody getBody() {
        return this.body;
    }

}
