// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstanceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceWhiteListResponseBody body;

    public static ListInstanceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceWhiteListResponse self = new ListInstanceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceWhiteListResponse setBody(ListInstanceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceWhiteListResponseBody getBody() {
        return this.body;
    }

}
