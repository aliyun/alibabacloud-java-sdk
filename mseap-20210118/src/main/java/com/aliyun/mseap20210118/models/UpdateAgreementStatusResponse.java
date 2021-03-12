// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class UpdateAgreementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAgreementStatusResponseBody body;

    public static UpdateAgreementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgreementStatusResponse self = new UpdateAgreementStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgreementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgreementStatusResponse setBody(UpdateAgreementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgreementStatusResponseBody getBody() {
        return this.body;
    }

}
