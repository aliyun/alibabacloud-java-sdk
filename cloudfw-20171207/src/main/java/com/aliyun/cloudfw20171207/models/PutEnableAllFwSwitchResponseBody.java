// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableAllFwSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PutEnableAllFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEnableAllFwSwitchResponseBody self = new PutEnableAllFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEnableAllFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
