// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeCampaignStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetRealtimeCampaignStatsResponse setBody(GetRealtimeCampaignStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeCampaignStatsResponseBody getBody() {
        return this.body;
    }

}
