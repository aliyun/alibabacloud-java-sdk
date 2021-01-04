// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableAllFwSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PutDisableAllFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDisableAllFwSwitchResponseBody self = new PutDisableAllFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDisableAllFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
