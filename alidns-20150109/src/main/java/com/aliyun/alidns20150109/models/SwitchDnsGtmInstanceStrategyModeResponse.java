// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchDnsGtmInstanceStrategyModeResponseBody body;

    public static SwitchDnsGtmInstanceStrategyModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDnsGtmInstanceStrategyModeResponse self = new SwitchDnsGtmInstanceStrategyModeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDnsGtmInstanceStrategyModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchDnsGtmInstanceStrategyModeResponse setBody(SwitchDnsGtmInstanceStrategyModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDnsGtmInstanceStrategyModeResponseBody getBody() {
        return this.body;
    }

}
