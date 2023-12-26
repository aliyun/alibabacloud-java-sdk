// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReserveInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReserveInstancesResponseBody body;

    public static ReserveInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReserveInstancesResponse self = new ReserveInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ReserveInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReserveInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReserveInstancesResponse setBody(ReserveInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReserveInstancesResponseBody getBody() {
        return this.body;
    }

}
