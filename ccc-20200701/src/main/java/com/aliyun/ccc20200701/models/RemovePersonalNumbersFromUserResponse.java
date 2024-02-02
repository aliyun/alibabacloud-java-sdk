// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePersonalNumbersFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePersonalNumbersFromUserResponseBody body;

    public static RemovePersonalNumbersFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePersonalNumbersFromUserResponse self = new RemovePersonalNumbersFromUserResponse();
        return TeaModel.build(map, self);
    }

    public RemovePersonalNumbersFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePersonalNumbersFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePersonalNumbersFromUserResponse setBody(RemovePersonalNumbersFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePersonalNumbersFromUserResponseBody getBody() {
        return this.body;
    }

}
