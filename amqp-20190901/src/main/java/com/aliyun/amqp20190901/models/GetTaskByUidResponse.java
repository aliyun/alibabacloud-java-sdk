// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetTaskByUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskByUidResponseBody body;

    public static GetTaskByUidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUidResponse self = new GetTaskByUidResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskByUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskByUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskByUidResponse setBody(GetTaskByUidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskByUidResponseBody getBody() {
        return this.body;
    }

}
