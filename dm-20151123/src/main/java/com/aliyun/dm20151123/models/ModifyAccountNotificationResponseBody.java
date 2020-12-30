// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyAccountNotificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountNotificationResponseBody self = new ModifyAccountNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
