// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class RemoveInstanceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveInstanceWhiteListResponseBody body;

    public static RemoveInstanceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceWhiteListResponse self = new RemoveInstanceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstanceWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInstanceWhiteListResponse setBody(RemoveInstanceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstanceWhiteListResponseBody getBody() {
        return this.body;
    }

}
