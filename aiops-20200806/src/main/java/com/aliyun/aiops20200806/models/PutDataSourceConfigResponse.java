// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutDataSourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutDataSourceConfigResponseBody body;

    public static PutDataSourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDataSourceConfigResponse self = new PutDataSourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutDataSourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDataSourceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDataSourceConfigResponse setBody(PutDataSourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDataSourceConfigResponseBody getBody() {
        return this.body;
    }

}
