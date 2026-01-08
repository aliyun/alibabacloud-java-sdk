// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class RemoveContactByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveContactByIdResponseBody body;

    public static RemoveContactByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveContactByIdResponse self = new RemoveContactByIdResponse();
        return TeaModel.build(map, self);
    }

    public RemoveContactByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveContactByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveContactByIdResponse setBody(RemoveContactByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveContactByIdResponseBody getBody() {
        return this.body;
    }

}
