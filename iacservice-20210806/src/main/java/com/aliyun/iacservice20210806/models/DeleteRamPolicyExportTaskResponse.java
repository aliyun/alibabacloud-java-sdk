// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRamPolicyExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRamPolicyExportTaskResponseBody body;

    public static DeleteRamPolicyExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRamPolicyExportTaskResponse self = new DeleteRamPolicyExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRamPolicyExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRamPolicyExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRamPolicyExportTaskResponse setBody(DeleteRamPolicyExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRamPolicyExportTaskResponseBody getBody() {
        return this.body;
    }

}
