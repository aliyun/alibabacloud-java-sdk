// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyIpPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEgressProxyIpPoolResponseBody body;

    public static CreateEgressProxyIpPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyIpPoolResponse self = new CreateEgressProxyIpPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyIpPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEgressProxyIpPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEgressProxyIpPoolResponse setBody(CreateEgressProxyIpPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEgressProxyIpPoolResponseBody getBody() {
        return this.body;
    }

}
