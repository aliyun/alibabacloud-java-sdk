// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RequestPayDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RequestPayDemandResponseBody body;

    public static RequestPayDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestPayDemandResponse self = new RequestPayDemandResponse();
        return TeaModel.build(map, self);
    }

    public RequestPayDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestPayDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestPayDemandResponse setBody(RequestPayDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestPayDemandResponseBody getBody() {
        return this.body;
    }

}
