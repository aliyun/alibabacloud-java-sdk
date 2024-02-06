// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemovePublicIpsFromEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemovePublicIpsFromEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePublicIpsFromEpnInstanceResponse setBody(RemovePublicIpsFromEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePublicIpsFromEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
