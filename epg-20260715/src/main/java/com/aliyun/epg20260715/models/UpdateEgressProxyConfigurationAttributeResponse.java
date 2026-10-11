// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyConfigurationAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEgressProxyConfigurationAttributeResponseBody body;

    public static UpdateEgressProxyConfigurationAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyConfigurationAttributeResponse self = new UpdateEgressProxyConfigurationAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyConfigurationAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEgressProxyConfigurationAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEgressProxyConfigurationAttributeResponse setBody(UpdateEgressProxyConfigurationAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEgressProxyConfigurationAttributeResponseBody getBody() {
        return this.body;
    }

}
