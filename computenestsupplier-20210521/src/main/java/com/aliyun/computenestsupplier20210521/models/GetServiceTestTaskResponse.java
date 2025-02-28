// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceTestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceTestTaskResponseBody body;

    public static GetServiceTestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTestTaskResponse self = new GetServiceTestTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceTestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceTestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceTestTaskResponse setBody(GetServiceTestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceTestTaskResponseBody getBody() {
        return this.body;
    }

}
