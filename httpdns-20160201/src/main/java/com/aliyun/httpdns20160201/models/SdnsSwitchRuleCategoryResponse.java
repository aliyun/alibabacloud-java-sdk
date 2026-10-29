// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsSwitchRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdnsSwitchRuleCategoryResponseBody body;

    public static SdnsSwitchRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SdnsSwitchRuleCategoryResponse self = new SdnsSwitchRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public SdnsSwitchRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdnsSwitchRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdnsSwitchRuleCategoryResponse setBody(SdnsSwitchRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SdnsSwitchRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
