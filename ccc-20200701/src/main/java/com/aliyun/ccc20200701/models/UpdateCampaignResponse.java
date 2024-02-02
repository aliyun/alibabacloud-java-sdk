// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCampaignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCampaignResponseBody body;

    public static UpdateCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCampaignResponse self = new UpdateCampaignResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCampaignResponse setBody(UpdateCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCampaignResponseBody getBody() {
        return this.body;
    }

}
