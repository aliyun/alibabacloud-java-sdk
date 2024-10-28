// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskInstanceResponseBody body;

    public static GetTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceResponse self = new GetTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskInstanceResponse setBody(GetTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
