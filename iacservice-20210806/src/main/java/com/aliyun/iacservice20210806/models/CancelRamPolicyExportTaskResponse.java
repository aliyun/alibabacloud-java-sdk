// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelRamPolicyExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRamPolicyExportTaskResponseBody body;

    public static CancelRamPolicyExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRamPolicyExportTaskResponse self = new CancelRamPolicyExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelRamPolicyExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRamPolicyExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRamPolicyExportTaskResponse setBody(CancelRamPolicyExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRamPolicyExportTaskResponseBody getBody() {
        return this.body;
    }

}
