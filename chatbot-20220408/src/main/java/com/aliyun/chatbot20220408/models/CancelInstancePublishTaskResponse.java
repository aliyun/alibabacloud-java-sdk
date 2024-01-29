// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelInstancePublishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelInstancePublishTaskResponseBody body;

    public static CancelInstancePublishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelInstancePublishTaskResponse self = new CancelInstancePublishTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelInstancePublishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelInstancePublishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelInstancePublishTaskResponse setBody(CancelInstancePublishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelInstancePublishTaskResponseBody getBody() {
        return this.body;
    }

}
