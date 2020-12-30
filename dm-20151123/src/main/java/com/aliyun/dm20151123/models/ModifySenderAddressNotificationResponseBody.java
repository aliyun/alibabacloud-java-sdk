// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifySenderAddressNotificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySenderAddressNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySenderAddressNotificationResponseBody self = new ModifySenderAddressNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySenderAddressNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
