// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentDetailReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentDetailReportResponseBody body;

    public static GetAgentDetailReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDetailReportResponse self = new GetAgentDetailReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDetailReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDetailReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentDetailReportResponse setBody(GetAgentDetailReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDetailReportResponseBody getBody() {
        return this.body;
    }

}
