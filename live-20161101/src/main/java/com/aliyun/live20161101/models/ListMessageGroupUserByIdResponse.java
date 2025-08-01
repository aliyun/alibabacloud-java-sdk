// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessageGroupUserByIdResponseBody body;

    public static ListMessageGroupUserByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserByIdResponse self = new ListMessageGroupUserByIdResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageGroupUserByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageGroupUserByIdResponse setBody(ListMessageGroupUserByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageGroupUserByIdResponseBody getBody() {
        return this.body;
    }

}
