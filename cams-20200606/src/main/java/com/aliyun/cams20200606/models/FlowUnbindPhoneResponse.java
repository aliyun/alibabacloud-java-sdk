// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowUnbindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowUnbindPhoneResponseBody body;

    public static FlowUnbindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        FlowUnbindPhoneResponse self = new FlowUnbindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public FlowUnbindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlowUnbindPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlowUnbindPhoneResponse setBody(FlowUnbindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public FlowUnbindPhoneResponseBody getBody() {
        return this.body;
    }

}
