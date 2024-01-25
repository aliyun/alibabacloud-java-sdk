// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body;

    public static SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse self = new SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse setBody(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

}
