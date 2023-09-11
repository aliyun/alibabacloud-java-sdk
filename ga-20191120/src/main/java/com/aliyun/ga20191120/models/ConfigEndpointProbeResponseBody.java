// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ConfigEndpointProbeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigEndpointProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigEndpointProbeResponseBody self = new ConfigEndpointProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigEndpointProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
