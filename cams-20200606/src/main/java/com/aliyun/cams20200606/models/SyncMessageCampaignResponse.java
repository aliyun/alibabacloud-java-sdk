// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SyncMessageCampaignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMessageCampaignResponseBody body;

    public static SyncMessageCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMessageCampaignResponse self = new SyncMessageCampaignResponse();
        return TeaModel.build(map, self);
    }

    public SyncMessageCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMessageCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMessageCampaignResponse setBody(SyncMessageCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMessageCampaignResponseBody getBody() {
        return this.body;
    }

}
