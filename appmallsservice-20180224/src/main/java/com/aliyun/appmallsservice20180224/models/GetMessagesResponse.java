// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class GetMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessagesResponseBody body;

    public static GetMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesResponse self = new GetMessagesResponse();
        return TeaModel.build(map, self);
    }

    public GetMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessagesResponse setBody(GetMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessagesResponseBody getBody() {
        return this.body;
    }

}
