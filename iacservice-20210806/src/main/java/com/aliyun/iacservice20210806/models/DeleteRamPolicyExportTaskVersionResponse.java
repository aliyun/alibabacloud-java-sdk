// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRamPolicyExportTaskVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRamPolicyExportTaskVersionResponseBody body;

    public static DeleteRamPolicyExportTaskVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRamPolicyExportTaskVersionResponse self = new DeleteRamPolicyExportTaskVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRamPolicyExportTaskVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRamPolicyExportTaskVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRamPolicyExportTaskVersionResponse setBody(DeleteRamPolicyExportTaskVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRamPolicyExportTaskVersionResponseBody getBody() {
        return this.body;
    }

}
