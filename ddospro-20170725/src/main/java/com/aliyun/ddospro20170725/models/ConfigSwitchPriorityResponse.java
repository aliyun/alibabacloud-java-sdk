// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ConfigSwitchPriorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigSwitchPriorityResponseBody body;

    public static ConfigSwitchPriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSwitchPriorityResponse self = new ConfigSwitchPriorityResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSwitchPriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSwitchPriorityResponse setBody(ConfigSwitchPriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSwitchPriorityResponseBody getBody() {
        return this.body;
    }

}
