// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpControlResponseBody body;

    public static ModifyIpControlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlResponse self = new ModifyIpControlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpControlResponse setBody(ModifyIpControlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpControlResponseBody getBody() {
        return this.body;
    }

}
