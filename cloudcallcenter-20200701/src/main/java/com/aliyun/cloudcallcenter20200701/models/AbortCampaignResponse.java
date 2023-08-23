// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class AbortCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AbortCampaignResponseBody body;

    public static AbortCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortCampaignResponse self = new AbortCampaignResponse();
        return TeaModel.build(map, self);
    }

    public AbortCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortCampaignResponse setBody(AbortCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortCampaignResponseBody getBody() {
        return this.body;
    }

}
