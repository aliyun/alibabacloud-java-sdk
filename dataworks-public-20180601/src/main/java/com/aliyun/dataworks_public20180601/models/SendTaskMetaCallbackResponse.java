// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SendTaskMetaCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendTaskMetaCallbackResponseBody body;

    public static SendTaskMetaCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTaskMetaCallbackResponse self = new SendTaskMetaCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SendTaskMetaCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTaskMetaCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTaskMetaCallbackResponse setBody(SendTaskMetaCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTaskMetaCallbackResponseBody getBody() {
        return this.body;
    }

}
