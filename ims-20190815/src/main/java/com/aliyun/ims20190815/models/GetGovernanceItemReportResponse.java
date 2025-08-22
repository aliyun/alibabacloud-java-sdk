// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceItemReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGovernanceItemReportResponseBody body;

    public static GetGovernanceItemReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceItemReportResponse self = new GetGovernanceItemReportResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceItemReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceItemReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGovernanceItemReportResponse setBody(GetGovernanceItemReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceItemReportResponseBody getBody() {
        return this.body;
    }

}
