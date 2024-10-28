// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveTaskInstanceDependenciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTaskInstanceDependenciesResponseBody body;

    public static RemoveTaskInstanceDependenciesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskInstanceDependenciesResponse self = new RemoveTaskInstanceDependenciesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTaskInstanceDependenciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTaskInstanceDependenciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTaskInstanceDependenciesResponse setBody(RemoveTaskInstanceDependenciesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTaskInstanceDependenciesResponseBody getBody() {
        return this.body;
    }

}
