// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageGroupUserResponseBody body;

    public static ListMessageGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserResponse self = new ListMessageGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageGroupUserResponse setBody(ListMessageGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageGroupUserResponseBody getBody() {
        return this.body;
    }

}
