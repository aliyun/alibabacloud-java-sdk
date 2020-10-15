// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveVSwitchesFromEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveVSwitchesFromEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVSwitchesFromEpnInstanceResponse self = new RemoveVSwitchesFromEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVSwitchesFromEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
