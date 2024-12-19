// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnsignWithholdAgreementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnsignWithholdAgreementResponseBody body;

    public static UnsignWithholdAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsignWithholdAgreementResponse self = new UnsignWithholdAgreementResponse();
        return TeaModel.build(map, self);
    }

    public UnsignWithholdAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsignWithholdAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsignWithholdAgreementResponse setBody(UnsignWithholdAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsignWithholdAgreementResponseBody getBody() {
        return this.body;
    }

}
