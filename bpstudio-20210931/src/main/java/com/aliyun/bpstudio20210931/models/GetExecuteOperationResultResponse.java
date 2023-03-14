// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetExecuteOperationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExecuteOperationResultResponseBody body;

    public static GetExecuteOperationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteOperationResultResponse self = new GetExecuteOperationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetExecuteOperationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecuteOperationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExecuteOperationResultResponse setBody(GetExecuteOperationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecuteOperationResultResponseBody getBody() {
        return this.body;
    }

}
