// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigRuntimeChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigRuntimeChannelResponseBody body;

    public static ConfigRuntimeChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigRuntimeChannelResponse self = new ConfigRuntimeChannelResponse();
        return TeaModel.build(map, self);
    }

    public ConfigRuntimeChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigRuntimeChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigRuntimeChannelResponse setBody(ConfigRuntimeChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigRuntimeChannelResponseBody getBody() {
        return this.body;
    }

}
