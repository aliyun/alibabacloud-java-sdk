// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SubmitCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCampaignResponseBody body;

    public static SubmitCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCampaignResponse self = new SubmitCampaignResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCampaignResponse setBody(SubmitCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCampaignResponseBody getBody() {
        return this.body;
    }

}
