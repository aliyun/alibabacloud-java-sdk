// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCampaignResponseBody body;

    public static CreateCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignResponse self = new CreateCampaignResponse();
        return TeaModel.build(map, self);
    }

    public CreateCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCampaignResponse setBody(CreateCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCampaignResponseBody getBody() {
        return this.body;
    }

}
