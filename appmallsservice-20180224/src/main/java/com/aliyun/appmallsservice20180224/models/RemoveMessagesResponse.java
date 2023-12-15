// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class RemoveMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMessagesResponseBody body;

    public static RemoveMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesResponse self = new RemoveMessagesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveMessagesResponse setBody(RemoveMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMessagesResponseBody getBody() {
        return this.body;
    }

}
