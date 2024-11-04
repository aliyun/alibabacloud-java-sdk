// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfigXResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigXResponseBody body;

    public static ConfigXResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigXResponse self = new ConfigXResponse();
        return TeaModel.build(map, self);
    }

    public ConfigXResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigXResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigXResponse setBody(ConfigXResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigXResponseBody getBody() {
        return this.body;
    }

}
