// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCampaignsResponseBody body;

    public static ListCampaignsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsResponse self = new ListCampaignsResponse();
        return TeaModel.build(map, self);
    }

    public ListCampaignsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCampaignsResponse setBody(ListCampaignsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCampaignsResponseBody getBody() {
        return this.body;
    }

}
