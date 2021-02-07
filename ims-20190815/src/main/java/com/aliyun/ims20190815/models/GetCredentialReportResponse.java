// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCredentialReportResponse setBody(GetCredentialReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCredentialReportResponseBody getBody() {
        return this.body;
    }

}
