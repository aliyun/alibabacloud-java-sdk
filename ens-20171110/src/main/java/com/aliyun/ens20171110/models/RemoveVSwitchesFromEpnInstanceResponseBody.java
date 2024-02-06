// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveVSwitchesFromEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVSwitchesFromEpnInstanceResponseBody self = new RemoveVSwitchesFromEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVSwitchesFromEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
