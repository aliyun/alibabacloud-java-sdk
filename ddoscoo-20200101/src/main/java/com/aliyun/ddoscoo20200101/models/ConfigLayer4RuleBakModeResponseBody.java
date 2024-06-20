// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC042262-15A3-4A49-ADF0-130968EA47BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RuleBakModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleBakModeResponseBody self = new ConfigLayer4RuleBakModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleBakModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
