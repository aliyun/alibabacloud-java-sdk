// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetUploadIdentityRegistrationDocConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadIdentityRegistrationDocConfigResponseBody body;

    public static GetUploadIdentityRegistrationDocConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadIdentityRegistrationDocConfigResponse self = new GetUploadIdentityRegistrationDocConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadIdentityRegistrationDocConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadIdentityRegistrationDocConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadIdentityRegistrationDocConfigResponse setBody(GetUploadIdentityRegistrationDocConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadIdentityRegistrationDocConfigResponseBody getBody() {
        return this.body;
    }

}
