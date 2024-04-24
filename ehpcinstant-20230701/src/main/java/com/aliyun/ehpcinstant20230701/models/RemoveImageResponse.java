// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class RemoveImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveImageResponseBody body;

    public static RemoveImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageResponse self = new RemoveImageResponse();
        return TeaModel.build(map, self);
    }

    public RemoveImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveImageResponse setBody(RemoveImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageResponseBody getBody() {
        return this.body;
    }

}
