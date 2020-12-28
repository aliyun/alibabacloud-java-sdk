// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckConfigurationExportResponse setBody(CheckConfigurationExportResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConfigurationExportResponseBody getBody() {
        return this.body;
    }

}
