// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyConfigurationAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEgressProxyConfigurationAttributeResponseBody body;

    public static GetEgressProxyConfigurationAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyConfigurationAttributeResponse self = new GetEgressProxyConfigurationAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyConfigurationAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEgressProxyConfigurationAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEgressProxyConfigurationAttributeResponse setBody(GetEgressProxyConfigurationAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEgressProxyConfigurationAttributeResponseBody getBody() {
        return this.body;
    }

}
