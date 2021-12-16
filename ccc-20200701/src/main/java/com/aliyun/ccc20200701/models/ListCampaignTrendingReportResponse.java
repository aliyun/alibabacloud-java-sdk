// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListCampaignTrendingReportResponse setBody(ListCampaignTrendingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCampaignTrendingReportResponseBody getBody() {
        return this.body;
    }

}
