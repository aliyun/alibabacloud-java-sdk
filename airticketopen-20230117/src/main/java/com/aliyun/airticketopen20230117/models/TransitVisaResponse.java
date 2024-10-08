// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TransitVisaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransitVisaResponseBody body;

    public static TransitVisaResponse build(java.util.Map<String, ?> map) throws Exception {
        TransitVisaResponse self = new TransitVisaResponse();
        return TeaModel.build(map, self);
    }

    public TransitVisaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransitVisaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransitVisaResponse setBody(TransitVisaResponseBody body) {
        this.body = body;
        return this;
    }
    public TransitVisaResponseBody getBody() {
        return this.body;
    }

}
