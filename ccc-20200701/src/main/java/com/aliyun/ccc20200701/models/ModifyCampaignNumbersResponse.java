// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCampaignNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCampaignNumbersResponseBody body;

    public static ModifyCampaignNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCampaignNumbersResponse self = new ModifyCampaignNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCampaignNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCampaignNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCampaignNumbersResponse setBody(ModifyCampaignNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCampaignNumbersResponseBody getBody() {
        return this.body;
    }

}
