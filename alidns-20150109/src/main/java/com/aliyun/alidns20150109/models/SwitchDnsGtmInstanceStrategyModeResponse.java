// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SwitchDnsGtmInstanceStrategyModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchDnsGtmInstanceStrategyModeResponse setBody(SwitchDnsGtmInstanceStrategyModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDnsGtmInstanceStrategyModeResponseBody getBody() {
        return this.body;
    }

}
