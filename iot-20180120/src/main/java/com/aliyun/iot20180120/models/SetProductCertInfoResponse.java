// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetProductCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetProductCertInfoResponseBody body;

    public static SetProductCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetProductCertInfoResponse self = new SetProductCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetProductCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetProductCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetProductCertInfoResponse setBody(SetProductCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetProductCertInfoResponseBody getBody() {
        return this.body;
    }

}
