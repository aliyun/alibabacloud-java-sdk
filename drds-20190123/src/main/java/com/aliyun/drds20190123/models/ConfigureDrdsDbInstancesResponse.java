// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ConfigureDrdsDbInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureDrdsDbInstancesResponseBody body;

    public static ConfigureDrdsDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDrdsDbInstancesResponse self = new ConfigureDrdsDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureDrdsDbInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureDrdsDbInstancesResponse setBody(ConfigureDrdsDbInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureDrdsDbInstancesResponseBody getBody() {
        return this.body;
    }

}
