// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class SynchronizeAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynchronizeAppResponseBody body;

    public static SynchronizeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeAppResponse self = new SynchronizeAppResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeAppResponse setBody(SynchronizeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeAppResponseBody getBody() {
        return this.body;
    }

}
