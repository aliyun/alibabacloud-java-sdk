// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20180807.models;

import com.aliyun.tea.*;

public class MachineTranslateECommerceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MachineTranslateECommerceResponseBody body;

    public static MachineTranslateECommerceResponse build(java.util.Map<String, ?> map) throws Exception {
        MachineTranslateECommerceResponse self = new MachineTranslateECommerceResponse();
        return TeaModel.build(map, self);
    }

    public MachineTranslateECommerceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MachineTranslateECommerceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MachineTranslateECommerceResponse setBody(MachineTranslateECommerceResponseBody body) {
        this.body = body;
        return this;
    }
    public MachineTranslateECommerceResponseBody getBody() {
        return this.body;
    }

}
