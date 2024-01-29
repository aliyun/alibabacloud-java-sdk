// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelPublishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelPublishTaskResponseBody body;

    public static CancelPublishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPublishTaskResponse self = new CancelPublishTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelPublishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPublishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelPublishTaskResponse setBody(CancelPublishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPublishTaskResponseBody getBody() {
        return this.body;
    }

}
