// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ExecIdentityProviderMetadataUrlResolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecIdentityProviderMetadataUrlResolutionResponseBody body;

    public static ExecIdentityProviderMetadataUrlResolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecIdentityProviderMetadataUrlResolutionResponse self = new ExecIdentityProviderMetadataUrlResolutionResponse();
        return TeaModel.build(map, self);
    }

    public ExecIdentityProviderMetadataUrlResolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecIdentityProviderMetadataUrlResolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecIdentityProviderMetadataUrlResolutionResponse setBody(ExecIdentityProviderMetadataUrlResolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecIdentityProviderMetadataUrlResolutionResponseBody getBody() {
        return this.body;
    }

}
