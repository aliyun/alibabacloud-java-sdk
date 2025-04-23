// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRamPolicyExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRamPolicyExportTaskResponseBody body;

    public static GetRamPolicyExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRamPolicyExportTaskResponse self = new GetRamPolicyExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetRamPolicyExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRamPolicyExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRamPolicyExportTaskResponse setBody(GetRamPolicyExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRamPolicyExportTaskResponseBody getBody() {
        return this.body;
    }

}
