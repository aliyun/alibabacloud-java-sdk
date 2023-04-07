// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigADConnectorUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorUserResponseBody self = new ConfigADConnectorUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
