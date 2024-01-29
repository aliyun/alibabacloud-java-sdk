// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ContinueInstancePublishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContinueInstancePublishTaskResponseBody body;

    public static ContinueInstancePublishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueInstancePublishTaskResponse self = new ContinueInstancePublishTaskResponse();
        return TeaModel.build(map, self);
    }

    public ContinueInstancePublishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueInstancePublishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinueInstancePublishTaskResponse setBody(ContinueInstancePublishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueInstancePublishTaskResponseBody getBody() {
        return this.body;
    }

}
