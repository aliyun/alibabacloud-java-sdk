// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationResponseBody body;

    public static GetOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationResponse self = new GetOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationResponse setBody(GetOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationResponseBody getBody() {
        return this.body;
    }

}
