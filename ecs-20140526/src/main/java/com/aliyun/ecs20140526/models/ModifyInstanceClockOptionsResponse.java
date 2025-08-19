// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceClockOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceClockOptionsResponseBody body;

    public static ModifyInstanceClockOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceClockOptionsResponse self = new ModifyInstanceClockOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceClockOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceClockOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceClockOptionsResponse setBody(ModifyInstanceClockOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceClockOptionsResponseBody getBody() {
        return this.body;
    }

}
