// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetOwnerAgreementInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOwnerAgreementInstanceResponseBody body;

    public static GetOwnerAgreementInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerAgreementInstanceResponse self = new GetOwnerAgreementInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetOwnerAgreementInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOwnerAgreementInstanceResponse setBody(GetOwnerAgreementInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOwnerAgreementInstanceResponseBody getBody() {
        return this.body;
    }

}
