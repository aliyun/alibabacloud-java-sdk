// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureSubscriptionResponseBody body;

    public static ConfigureSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionResponse self = new ConfigureSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureSubscriptionResponse setBody(ConfigureSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSubscriptionResponseBody getBody() {
        return this.body;
    }

}
