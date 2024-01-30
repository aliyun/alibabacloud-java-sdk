// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body;

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse self = new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse setBody(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody getBody() {
        return this.body;
    }

}
