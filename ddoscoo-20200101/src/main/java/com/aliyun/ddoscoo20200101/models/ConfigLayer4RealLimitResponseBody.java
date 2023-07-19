// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RealLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RealLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RealLimitResponseBody self = new ConfigLayer4RealLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RealLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
