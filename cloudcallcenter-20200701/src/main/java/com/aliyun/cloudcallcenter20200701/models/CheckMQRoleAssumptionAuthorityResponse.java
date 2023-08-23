// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CheckMQRoleAssumptionAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMQRoleAssumptionAuthorityResponseBody body;

    public static CheckMQRoleAssumptionAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMQRoleAssumptionAuthorityResponse self = new CheckMQRoleAssumptionAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public CheckMQRoleAssumptionAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMQRoleAssumptionAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMQRoleAssumptionAuthorityResponse setBody(CheckMQRoleAssumptionAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMQRoleAssumptionAuthorityResponseBody getBody() {
        return this.body;
    }

}
