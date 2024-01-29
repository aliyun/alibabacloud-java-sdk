// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveInstancesResponseBody body;

    public static RemoveInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesResponse self = new RemoveInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInstancesResponse setBody(RemoveInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstancesResponseBody getBody() {
        return this.body;
    }

}
