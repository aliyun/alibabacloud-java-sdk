// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigHealthCheckResponseBody self = new ConfigHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
