// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySubscriptionMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionMappingResponseBody self = new ModifySubscriptionMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
