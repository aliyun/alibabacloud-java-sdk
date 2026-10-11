// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class RemoveIpAddressesFromEgressProxyIpPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveIpAddressesFromEgressProxyIpPoolResponseBody body;

    public static RemoveIpAddressesFromEgressProxyIpPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpAddressesFromEgressProxyIpPoolResponse self = new RemoveIpAddressesFromEgressProxyIpPoolResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIpAddressesFromEgressProxyIpPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIpAddressesFromEgressProxyIpPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveIpAddressesFromEgressProxyIpPoolResponse setBody(RemoveIpAddressesFromEgressProxyIpPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIpAddressesFromEgressProxyIpPoolResponseBody getBody() {
        return this.body;
    }

}
