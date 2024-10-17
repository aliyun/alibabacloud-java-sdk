// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDataExportJobResponseBody body;

    public static RestartDataExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDataExportJobResponse self = new RestartDataExportJobResponse();
        return TeaModel.build(map, self);
    }

    public RestartDataExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDataExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDataExportJobResponse setBody(RestartDataExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDataExportJobResponseBody getBody() {
        return this.body;
    }

}
