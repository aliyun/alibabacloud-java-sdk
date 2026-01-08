// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateMessageCampaignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessageCampaignResponseBody body;

    public static CreateMessageCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageCampaignResponse self = new CreateMessageCampaignResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageCampaignResponse setBody(CreateMessageCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageCampaignResponseBody getBody() {
        return this.body;
    }

}
