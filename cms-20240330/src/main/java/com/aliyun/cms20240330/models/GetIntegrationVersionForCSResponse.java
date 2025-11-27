// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetIntegrationVersionForCSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntegrationVersionForCSResponseBody body;

    public static GetIntegrationVersionForCSResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationVersionForCSResponse self = new GetIntegrationVersionForCSResponse();
        return TeaModel.build(map, self);
    }

    public GetIntegrationVersionForCSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntegrationVersionForCSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntegrationVersionForCSResponse setBody(GetIntegrationVersionForCSResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntegrationVersionForCSResponseBody getBody() {
        return this.body;
    }

}
