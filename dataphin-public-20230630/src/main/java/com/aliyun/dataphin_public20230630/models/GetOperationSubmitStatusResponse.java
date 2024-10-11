// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationSubmitStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationSubmitStatusResponseBody body;

    public static GetOperationSubmitStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationSubmitStatusResponse self = new GetOperationSubmitStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationSubmitStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationSubmitStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationSubmitStatusResponse setBody(GetOperationSubmitStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationSubmitStatusResponseBody getBody() {
        return this.body;
    }

}
