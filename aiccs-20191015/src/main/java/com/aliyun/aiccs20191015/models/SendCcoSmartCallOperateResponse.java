// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendCcoSmartCallOperateResponseBody body;

    public static SendCcoSmartCallOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallOperateResponse self = new SendCcoSmartCallOperateResponse();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCcoSmartCallOperateResponse setBody(SendCcoSmartCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCcoSmartCallOperateResponseBody getBody() {
        return this.body;
    }

}
