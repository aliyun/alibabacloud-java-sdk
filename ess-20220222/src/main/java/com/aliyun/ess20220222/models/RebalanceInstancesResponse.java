// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RebalanceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebalanceInstancesResponseBody body;

    public static RebalanceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebalanceInstancesResponse self = new RebalanceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebalanceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebalanceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebalanceInstancesResponse setBody(RebalanceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebalanceInstancesResponseBody getBody() {
        return this.body;
    }

}
