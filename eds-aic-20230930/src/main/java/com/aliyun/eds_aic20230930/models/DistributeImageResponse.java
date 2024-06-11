// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DistributeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DistributeImageResponseBody body;

    public static DistributeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DistributeImageResponse self = new DistributeImageResponse();
        return TeaModel.build(map, self);
    }

    public DistributeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DistributeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DistributeImageResponse setBody(DistributeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DistributeImageResponseBody getBody() {
        return this.body;
    }

}
