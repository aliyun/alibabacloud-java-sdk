// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyScaleStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScaleStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScaleStrategyResponseBody self = new ModifyScaleStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScaleStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
