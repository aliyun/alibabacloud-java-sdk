// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDeleteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSetDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDeleteResponseBody self = new ConfigSetDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
