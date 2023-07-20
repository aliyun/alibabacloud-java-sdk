// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstancesProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstancesProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstancesProtectionResponseBody self = new SetInstancesProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstancesProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
