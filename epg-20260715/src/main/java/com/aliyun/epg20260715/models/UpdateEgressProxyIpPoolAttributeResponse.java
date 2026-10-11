// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyIpPoolAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEgressProxyIpPoolAttributeResponseBody body;

    public static UpdateEgressProxyIpPoolAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyIpPoolAttributeResponse self = new UpdateEgressProxyIpPoolAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyIpPoolAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEgressProxyIpPoolAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEgressProxyIpPoolAttributeResponse setBody(UpdateEgressProxyIpPoolAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEgressProxyIpPoolAttributeResponseBody getBody() {
        return this.body;
    }

}
