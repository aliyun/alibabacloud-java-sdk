// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCredentialReportResponseBody body;

    public static GetCredentialReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportResponse self = new GetCredentialReportResponse();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCredentialReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCredentialReportResponse setBody(GetCredentialReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCredentialReportResponseBody getBody() {
        return this.body;
    }

}
