// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ConfigureResultExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureResultExportResponseBody body;

    public static ConfigureResultExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureResultExportResponse self = new ConfigureResultExportResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureResultExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureResultExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureResultExportResponse setBody(ConfigureResultExportResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureResultExportResponseBody getBody() {
        return this.body;
    }

}
