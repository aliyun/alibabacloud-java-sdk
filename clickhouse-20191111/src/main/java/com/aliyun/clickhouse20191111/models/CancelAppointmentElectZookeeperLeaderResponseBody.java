// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CancelAppointmentElectZookeeperLeaderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1F488A93-83FD-540F-9B67-0333AF64E6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelAppointmentElectZookeeperLeaderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAppointmentElectZookeeperLeaderResponseBody self = new CancelAppointmentElectZookeeperLeaderResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAppointmentElectZookeeperLeaderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
