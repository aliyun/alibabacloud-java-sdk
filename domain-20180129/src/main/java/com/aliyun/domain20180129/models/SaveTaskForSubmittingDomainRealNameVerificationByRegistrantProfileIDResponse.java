// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse setBody(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

}
