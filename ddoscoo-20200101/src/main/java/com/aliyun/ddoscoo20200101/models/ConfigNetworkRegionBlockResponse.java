// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigNetworkRegionBlockResponseBody body;

    public static ConfigNetworkRegionBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockResponse self = new ConfigNetworkRegionBlockResponse();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigNetworkRegionBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigNetworkRegionBlockResponse setBody(ConfigNetworkRegionBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigNetworkRegionBlockResponseBody getBody() {
        return this.body;
    }

}
