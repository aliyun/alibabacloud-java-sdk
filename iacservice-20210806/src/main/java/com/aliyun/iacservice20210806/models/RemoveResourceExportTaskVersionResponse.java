// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveResourceExportTaskVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveResourceExportTaskVersionResponseBody body;

    public static RemoveResourceExportTaskVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveResourceExportTaskVersionResponse self = new RemoveResourceExportTaskVersionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveResourceExportTaskVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveResourceExportTaskVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveResourceExportTaskVersionResponse setBody(RemoveResourceExportTaskVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveResourceExportTaskVersionResponseBody getBody() {
        return this.body;
    }

}
