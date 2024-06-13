// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateResourcesDeleteProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourcesDeleteProtectionResponseBody body;

    public static UpdateResourcesDeleteProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesDeleteProtectionResponse self = new UpdateResourcesDeleteProtectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesDeleteProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourcesDeleteProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourcesDeleteProtectionResponse setBody(UpdateResourcesDeleteProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourcesDeleteProtectionResponseBody getBody() {
        return this.body;
    }

}
