// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCampaignReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoricalCampaignReportResponseBody body;

    public static GetHistoricalCampaignReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCampaignReportResponse self = new GetHistoricalCampaignReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCampaignReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoricalCampaignReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoricalCampaignReportResponse setBody(GetHistoricalCampaignReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoricalCampaignReportResponseBody getBody() {
        return this.body;
    }

}
