// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class OpenDomainSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenDomainSlsConfigResponseBody body;

    public static OpenDomainSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDomainSlsConfigResponse self = new OpenDomainSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public OpenDomainSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDomainSlsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDomainSlsConfigResponse setBody(OpenDomainSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDomainSlsConfigResponseBody getBody() {
        return this.body;
    }

}
