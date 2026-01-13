// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ApplyFormalServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyFormalServiceResponseBody body;

    public static ApplyFormalServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyFormalServiceResponse self = new ApplyFormalServiceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyFormalServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyFormalServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyFormalServiceResponse setBody(ApplyFormalServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyFormalServiceResponseBody getBody() {
        return this.body;
    }

}
