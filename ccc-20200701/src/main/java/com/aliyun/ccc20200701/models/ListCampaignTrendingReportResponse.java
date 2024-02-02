// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCampaignTrendingReportResponseBody body;

    public static ListCampaignTrendingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignTrendingReportResponse self = new ListCampaignTrendingReportResponse();
        return TeaModel.build(map, self);
    }

    public ListCampaignTrendingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCampaignTrendingReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCampaignTrendingReportResponse setBody(ListCampaignTrendingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCampaignTrendingReportResponseBody getBody() {
        return this.body;
    }

}
