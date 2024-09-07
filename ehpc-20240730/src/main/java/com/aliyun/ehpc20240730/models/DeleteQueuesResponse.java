// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteQueuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQueuesResponseBody body;

    public static DeleteQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueuesResponse self = new DeleteQueuesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQueuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQueuesResponse setBody(DeleteQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQueuesResponseBody getBody() {
        return this.body;
    }

}
