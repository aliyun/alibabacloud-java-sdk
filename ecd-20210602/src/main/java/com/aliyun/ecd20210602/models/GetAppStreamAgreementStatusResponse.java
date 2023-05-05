// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAppStreamAgreementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppStreamAgreementStatusResponseBody body;

    public static GetAppStreamAgreementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppStreamAgreementStatusResponse self = new GetAppStreamAgreementStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAppStreamAgreementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppStreamAgreementStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppStreamAgreementStatusResponse setBody(GetAppStreamAgreementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppStreamAgreementStatusResponseBody getBody() {
        return this.body;
    }

}
