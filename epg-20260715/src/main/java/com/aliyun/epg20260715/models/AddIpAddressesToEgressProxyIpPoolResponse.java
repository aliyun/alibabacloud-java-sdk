// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AddIpAddressesToEgressProxyIpPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIpAddressesToEgressProxyIpPoolResponseBody body;

    public static AddIpAddressesToEgressProxyIpPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpAddressesToEgressProxyIpPoolResponse self = new AddIpAddressesToEgressProxyIpPoolResponse();
        return TeaModel.build(map, self);
    }

    public AddIpAddressesToEgressProxyIpPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpAddressesToEgressProxyIpPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIpAddressesToEgressProxyIpPoolResponse setBody(AddIpAddressesToEgressProxyIpPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpAddressesToEgressProxyIpPoolResponseBody getBody() {
        return this.body;
    }

}
