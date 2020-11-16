// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EffectCasterUrgentResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentResponse self = new EffectCasterUrgentResponse();
        return TeaModel.build(map, self);
    }

    public EffectCasterUrgentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
