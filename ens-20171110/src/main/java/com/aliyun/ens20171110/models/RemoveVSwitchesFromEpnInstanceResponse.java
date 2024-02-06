// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveVSwitchesFromEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVSwitchesFromEpnInstanceResponse setBody(RemoveVSwitchesFromEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVSwitchesFromEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
