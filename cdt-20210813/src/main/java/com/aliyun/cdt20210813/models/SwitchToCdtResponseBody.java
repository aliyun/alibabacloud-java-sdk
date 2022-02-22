// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class SwitchToCdtResponseBody extends TeaModel {
    @NameInMap("EffectiveTime")
    public Long effectiveTime;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchToCdtResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchToCdtResponseBody self = new SwitchToCdtResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchToCdtResponseBody setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public Long getEffectiveTime() {
        return this.effectiveTime;
    }

    public SwitchToCdtResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
