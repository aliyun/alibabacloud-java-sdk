// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomMessageToUsersResponseBody body;

    public static SendCustomMessageToUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToUsersResponse self = new SendCustomMessageToUsersResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomMessageToUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomMessageToUsersResponse setBody(SendCustomMessageToUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomMessageToUsersResponseBody getBody() {
        return this.body;
    }

}
