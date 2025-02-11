// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HangupOperateResponseBody body;

    public static HangupOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        HangupOperateResponse self = new HangupOperateResponse();
        return TeaModel.build(map, self);
    }

    public HangupOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HangupOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HangupOperateResponse setBody(HangupOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public HangupOperateResponseBody getBody() {
        return this.body;
    }

}
