// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigWebIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebIpSetResponseBody self = new ConfigWebIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigWebIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
