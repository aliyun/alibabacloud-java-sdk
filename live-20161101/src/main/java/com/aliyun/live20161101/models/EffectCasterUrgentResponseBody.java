// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EffectCasterUrgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentResponseBody self = new EffectCasterUrgentResponseBody();
        return TeaModel.build(map, self);
    }

    public EffectCasterUrgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
