// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7BlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigLayer7BlackWhiteListResponseBody body;

    public static ConfigLayer7BlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7BlackWhiteListResponse self = new ConfigLayer7BlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7BlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigLayer7BlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigLayer7BlackWhiteListResponse setBody(ConfigLayer7BlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigLayer7BlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
