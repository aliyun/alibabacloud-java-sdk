// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateServerlessClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServerlessClusterResponseBody body;

    public static CreateServerlessClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServerlessClusterResponse self = new CreateServerlessClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateServerlessClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServerlessClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServerlessClusterResponse setBody(CreateServerlessClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServerlessClusterResponseBody getBody() {
        return this.body;
    }

}
