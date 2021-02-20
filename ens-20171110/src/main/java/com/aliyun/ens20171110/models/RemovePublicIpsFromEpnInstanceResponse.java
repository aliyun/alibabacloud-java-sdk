// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemovePublicIpsFromEpnInstanceResponseBody body;

    public static RemovePublicIpsFromEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePublicIpsFromEpnInstanceResponse self = new RemovePublicIpsFromEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemovePublicIpsFromEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePublicIpsFromEpnInstanceResponse setBody(RemovePublicIpsFromEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePublicIpsFromEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
