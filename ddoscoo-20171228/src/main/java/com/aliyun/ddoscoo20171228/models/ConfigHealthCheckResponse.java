// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigHealthCheckResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigHealthCheckResponse self = new ConfigHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public ConfigHealthCheckResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
