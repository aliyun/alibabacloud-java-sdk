// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class AddInstanceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInstanceWhiteListResponseBody body;

    public static AddInstanceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceWhiteListResponse self = new AddInstanceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstanceWhiteListResponse setBody(AddInstanceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceWhiteListResponseBody getBody() {
        return this.body;
    }

}
