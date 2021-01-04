// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyIpWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpWhitelistGroupResponseBody body;

    public static ModifyIpWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhitelistGroupResponse self = new ModifyIpWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpWhitelistGroupResponse setBody(ModifyIpWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
