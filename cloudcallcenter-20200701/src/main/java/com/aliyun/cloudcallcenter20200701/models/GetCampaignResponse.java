// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCampaignResponseBody body;

    public static GetCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCampaignResponse self = new GetCampaignResponse();
        return TeaModel.build(map, self);
    }

    public GetCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCampaignResponse setBody(GetCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCampaignResponseBody getBody() {
        return this.body;
    }

}
