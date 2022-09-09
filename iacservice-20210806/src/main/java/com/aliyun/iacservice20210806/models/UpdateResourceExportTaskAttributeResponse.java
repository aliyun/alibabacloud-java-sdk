// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateResourceExportTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceExportTaskAttributeResponseBody body;

    public static UpdateResourceExportTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceExportTaskAttributeResponse self = new UpdateResourceExportTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceExportTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceExportTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceExportTaskAttributeResponse setBody(UpdateResourceExportTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceExportTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
