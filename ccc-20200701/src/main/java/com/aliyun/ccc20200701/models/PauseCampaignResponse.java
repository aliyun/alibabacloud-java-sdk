// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PauseCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PauseCampaignResponseBody body;

    public static PauseCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseCampaignResponse self = new PauseCampaignResponse();
        return TeaModel.build(map, self);
    }

    public PauseCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseCampaignResponse setBody(PauseCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseCampaignResponseBody getBody() {
        return this.body;
    }

}
