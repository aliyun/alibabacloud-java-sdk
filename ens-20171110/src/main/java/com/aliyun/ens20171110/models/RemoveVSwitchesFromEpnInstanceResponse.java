// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveVSwitchesFromEpnInstanceResponseBody body;

    public static RemoveVSwitchesFromEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVSwitchesFromEpnInstanceResponse self = new RemoveVSwitchesFromEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVSwitchesFromEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVSwitchesFromEpnInstanceResponse setBody(RemoveVSwitchesFromEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVSwitchesFromEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
