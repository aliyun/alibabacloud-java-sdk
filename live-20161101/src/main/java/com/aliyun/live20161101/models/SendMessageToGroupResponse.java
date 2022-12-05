// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendMessageToGroupResponseBody body;

    public static SendMessageToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupResponse self = new SendMessageToGroupResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageToGroupResponse setBody(SendMessageToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageToGroupResponseBody getBody() {
        return this.body;
    }

}
