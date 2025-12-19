// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetOperationParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationParamsResponseBody body;

    public static GetOperationParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationParamsResponse self = new GetOperationParamsResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationParamsResponse setBody(GetOperationParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationParamsResponseBody getBody() {
        return this.body;
    }

}
