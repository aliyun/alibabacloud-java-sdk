// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetOrganizationUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetOrganizationUserPasswordResponseBody body;

    public static ResetOrganizationUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetOrganizationUserPasswordResponse self = new ResetOrganizationUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetOrganizationUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetOrganizationUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetOrganizationUserPasswordResponse setBody(ResetOrganizationUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetOrganizationUserPasswordResponseBody getBody() {
        return this.body;
    }

}
