// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RebootInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootInstancesResponseBody body;

    public static RebootInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponse self = new RebootInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootInstancesResponse setBody(RebootInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootInstancesResponseBody getBody() {
        return this.body;
    }

}
