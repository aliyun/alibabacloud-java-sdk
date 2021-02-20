// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class GenerateVulReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateVulReportResponseBody body;

    public static GenerateVulReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVulReportResponse self = new GenerateVulReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVulReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVulReportResponse setBody(GenerateVulReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVulReportResponseBody getBody() {
        return this.body;
    }

}
