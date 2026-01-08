// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMessageCampaignInsightsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageCampaignInsightsResponseBody body;

    public static GetMessageCampaignInsightsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCampaignInsightsResponse self = new GetMessageCampaignInsightsResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCampaignInsightsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCampaignInsightsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageCampaignInsightsResponse setBody(GetMessageCampaignInsightsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCampaignInsightsResponseBody getBody() {
        return this.body;
    }

}
