// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RerunTaskInstancesResponseBody body;

    public static RerunTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunTaskInstancesResponse self = new RerunTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RerunTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunTaskInstancesResponse setBody(RerunTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
