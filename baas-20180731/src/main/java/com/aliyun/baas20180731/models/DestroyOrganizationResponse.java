// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DestroyOrganizationResponseBody body;

    public static DestroyOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyOrganizationResponse self = new DestroyOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public DestroyOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyOrganizationResponse setBody(DestroyOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyOrganizationResponseBody getBody() {
        return this.body;
    }

}
