// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountingReportResponseBody body;

    public static GetAccountingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountingReportResponse self = new GetAccountingReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountingReportResponse setBody(GetAccountingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountingReportResponseBody getBody() {
        return this.body;
    }

}
