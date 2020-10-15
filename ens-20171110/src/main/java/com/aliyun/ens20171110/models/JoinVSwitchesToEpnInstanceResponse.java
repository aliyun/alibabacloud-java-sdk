// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static JoinVSwitchesToEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinVSwitchesToEpnInstanceResponse self = new JoinVSwitchesToEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public JoinVSwitchesToEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
