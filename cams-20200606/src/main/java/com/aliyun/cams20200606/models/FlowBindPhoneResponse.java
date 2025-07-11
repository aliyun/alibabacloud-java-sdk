// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowBindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowBindPhoneResponseBody body;

    public static FlowBindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        FlowBindPhoneResponse self = new FlowBindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public FlowBindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlowBindPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlowBindPhoneResponse setBody(FlowBindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public FlowBindPhoneResponseBody getBody() {
        return this.body;
    }

}
