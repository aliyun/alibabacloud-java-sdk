// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetApplicationProvisioningScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningScopeResponseBody self = new SetApplicationProvisioningScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
