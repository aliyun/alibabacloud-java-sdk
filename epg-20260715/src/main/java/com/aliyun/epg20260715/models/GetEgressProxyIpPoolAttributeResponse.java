// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyIpPoolAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEgressProxyIpPoolAttributeResponseBody body;

    public static GetEgressProxyIpPoolAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyIpPoolAttributeResponse self = new GetEgressProxyIpPoolAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyIpPoolAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEgressProxyIpPoolAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEgressProxyIpPoolAttributeResponse setBody(GetEgressProxyIpPoolAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEgressProxyIpPoolAttributeResponseBody getBody() {
        return this.body;
    }

}
