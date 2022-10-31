// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DynamicUpdateWaterMarkStreamRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DynamicUpdateWaterMarkStreamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DynamicUpdateWaterMarkStreamRuleResponseBody self = new DynamicUpdateWaterMarkStreamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DynamicUpdateWaterMarkStreamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
