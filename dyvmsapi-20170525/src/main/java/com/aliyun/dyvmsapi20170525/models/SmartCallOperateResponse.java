// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmartCallOperateResponseBody body;

    public static SmartCallOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartCallOperateResponse self = new SmartCallOperateResponse();
        return TeaModel.build(map, self);
    }

    public SmartCallOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartCallOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmartCallOperateResponse setBody(SmartCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartCallOperateResponseBody getBody() {
        return this.body;
    }

}
