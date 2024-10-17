// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RemoveDataExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDataExportJobResponseBody body;

    public static RemoveDataExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataExportJobResponse self = new RemoveDataExportJobResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataExportJobResponse setBody(RemoveDataExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataExportJobResponseBody getBody() {
        return this.body;
    }

}
