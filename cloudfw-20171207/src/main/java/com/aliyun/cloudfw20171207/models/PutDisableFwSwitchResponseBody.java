// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PutDisableFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDisableFwSwitchResponseBody self = new PutDisableFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDisableFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
