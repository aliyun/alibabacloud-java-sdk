// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetAppStreamAgreementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppStreamAgreementStatusResponseBody body;

    public static SetAppStreamAgreementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppStreamAgreementStatusResponse self = new SetAppStreamAgreementStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetAppStreamAgreementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppStreamAgreementStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAppStreamAgreementStatusResponse setBody(SetAppStreamAgreementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppStreamAgreementStatusResponseBody getBody() {
        return this.body;
    }

}
