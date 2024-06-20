// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigUdpReflectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9EC62E89-BD30-4FCD-9CB8-FA53865FF0D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigUdpReflectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigUdpReflectResponseBody self = new ConfigUdpReflectResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigUdpReflectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
