// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SendCcoSmartCallOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCcoSmartCallOperateResponse setBody(SendCcoSmartCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCcoSmartCallOperateResponseBody getBody() {
        return this.body;
    }

}
