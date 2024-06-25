// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckConfigurationExportResponseBody body;

    public static CheckConfigurationExportResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationExportResponse self = new CheckConfigurationExportResponse();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckConfigurationExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckConfigurationExportResponse setBody(CheckConfigurationExportResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConfigurationExportResponseBody getBody() {
        return this.body;
    }

}
