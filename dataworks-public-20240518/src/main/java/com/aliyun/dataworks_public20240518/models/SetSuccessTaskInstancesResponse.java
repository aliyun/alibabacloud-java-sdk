// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SetSuccessTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSuccessTaskInstancesResponseBody body;

    public static SetSuccessTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessTaskInstancesResponse self = new SetSuccessTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SetSuccessTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSuccessTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSuccessTaskInstancesResponse setBody(SetSuccessTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSuccessTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
