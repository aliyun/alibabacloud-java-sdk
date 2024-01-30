// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertDeployGroupResponseBody body;

    public static InsertDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertDeployGroupResponse self = new InsertDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public InsertDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertDeployGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertDeployGroupResponse setBody(InsertDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertDeployGroupResponseBody getBody() {
        return this.body;
    }

}
