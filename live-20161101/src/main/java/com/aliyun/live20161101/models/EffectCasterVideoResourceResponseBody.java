// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterVideoResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EffectCasterVideoResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterVideoResourceResponseBody self = new EffectCasterVideoResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EffectCasterVideoResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
