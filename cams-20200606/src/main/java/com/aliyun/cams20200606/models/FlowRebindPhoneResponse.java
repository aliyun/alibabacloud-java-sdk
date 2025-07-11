// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowRebindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowRebindPhoneResponseBody body;

    public static FlowRebindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        FlowRebindPhoneResponse self = new FlowRebindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public FlowRebindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlowRebindPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlowRebindPhoneResponse setBody(FlowRebindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public FlowRebindPhoneResponseBody getBody() {
        return this.body;
    }

}
