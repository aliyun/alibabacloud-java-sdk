// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static JoinVSwitchesToEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinVSwitchesToEpnInstanceResponseBody self = new JoinVSwitchesToEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinVSwitchesToEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
