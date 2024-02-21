// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConsumerGroupPasswordResponseBody body;

    public static ModifyConsumerGroupPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupPasswordResponse self = new ModifyConsumerGroupPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumerGroupPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConsumerGroupPasswordResponse setBody(ModifyConsumerGroupPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerGroupPasswordResponseBody getBody() {
        return this.body;
    }

}
