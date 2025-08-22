// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceReportStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGovernanceReportStatusResponseBody body;

    public static GetGovernanceReportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceReportStatusResponse self = new GetGovernanceReportStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceReportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceReportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGovernanceReportStatusResponse setBody(GetGovernanceReportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceReportStatusResponseBody getBody() {
        return this.body;
    }

}
