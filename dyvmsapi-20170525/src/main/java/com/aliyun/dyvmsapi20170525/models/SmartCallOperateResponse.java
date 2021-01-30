// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SmartCallOperateResponse setBody(SmartCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartCallOperateResponseBody getBody() {
        return this.body;
    }

}
