// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessageCampaignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessageCampaignResponseBody body;

    public static ListMessageCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageCampaignResponse self = new ListMessageCampaignResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageCampaignResponse setBody(ListMessageCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageCampaignResponseBody getBody() {
        return this.body;
    }

}
