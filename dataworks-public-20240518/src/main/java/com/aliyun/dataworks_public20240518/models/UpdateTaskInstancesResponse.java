// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskInstancesResponseBody body;

    public static UpdateTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskInstancesResponse self = new UpdateTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskInstancesResponse setBody(UpdateTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
