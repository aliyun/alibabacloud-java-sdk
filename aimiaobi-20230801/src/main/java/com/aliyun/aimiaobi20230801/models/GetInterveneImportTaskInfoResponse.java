// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterveneImportTaskInfoResponseBody body;

    public static GetInterveneImportTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneImportTaskInfoResponse self = new GetInterveneImportTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInterveneImportTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterveneImportTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterveneImportTaskInfoResponse setBody(GetInterveneImportTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterveneImportTaskInfoResponseBody getBody() {
        return this.body;
    }

}
