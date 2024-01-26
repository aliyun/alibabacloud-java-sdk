// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdpMetadataResponseBody body;

    public static SetIdpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataResponse self = new SetIdpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdpMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdpMetadataResponse setBody(SetIdpMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdpMetadataResponseBody getBody() {
        return this.body;
    }

}
