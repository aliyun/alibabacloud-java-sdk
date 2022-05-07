// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetConnectionPoolIpOperationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectionPoolIpOperationResultResponseBody body;

    public static GetConnectionPoolIpOperationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionPoolIpOperationResultResponse self = new GetConnectionPoolIpOperationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionPoolIpOperationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectionPoolIpOperationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConnectionPoolIpOperationResultResponse setBody(GetConnectionPoolIpOperationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectionPoolIpOperationResultResponseBody getBody() {
        return this.body;
    }

}
