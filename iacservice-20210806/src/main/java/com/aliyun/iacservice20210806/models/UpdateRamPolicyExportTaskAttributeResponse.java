// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRamPolicyExportTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRamPolicyExportTaskAttributeResponseBody body;

    public static UpdateRamPolicyExportTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRamPolicyExportTaskAttributeResponse self = new UpdateRamPolicyExportTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRamPolicyExportTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRamPolicyExportTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRamPolicyExportTaskAttributeResponse setBody(UpdateRamPolicyExportTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRamPolicyExportTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
