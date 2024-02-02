// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeCampaignStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeCampaignStatsResponseBody body;

    public static GetRealtimeCampaignStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeCampaignStatsResponse self = new GetRealtimeCampaignStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeCampaignStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeCampaignStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeCampaignStatsResponse setBody(GetRealtimeCampaignStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeCampaignStatsResponseBody getBody() {
        return this.body;
    }

}
