// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResumeCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeCampaignResponseBody body;

    public static ResumeCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeCampaignResponse self = new ResumeCampaignResponse();
        return TeaModel.build(map, self);
    }

    public ResumeCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeCampaignResponse setBody(ResumeCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeCampaignResponseBody getBody() {
        return this.body;
    }

}
