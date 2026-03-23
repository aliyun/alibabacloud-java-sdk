// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class OpenSendifyTrialServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenSendifyTrialServiceResponseBody body;

    public static OpenSendifyTrialServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSendifyTrialServiceResponse self = new OpenSendifyTrialServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenSendifyTrialServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSendifyTrialServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenSendifyTrialServiceResponse setBody(OpenSendifyTrialServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSendifyTrialServiceResponseBody getBody() {
        return this.body;
    }

}
