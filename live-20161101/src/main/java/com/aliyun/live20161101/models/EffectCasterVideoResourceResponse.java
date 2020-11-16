// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterVideoResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EffectCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterVideoResourceResponse self = new EffectCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public EffectCasterVideoResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
