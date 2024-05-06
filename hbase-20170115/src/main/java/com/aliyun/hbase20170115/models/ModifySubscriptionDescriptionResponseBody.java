// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySubscriptionDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionDescriptionResponseBody self = new ModifySubscriptionDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
