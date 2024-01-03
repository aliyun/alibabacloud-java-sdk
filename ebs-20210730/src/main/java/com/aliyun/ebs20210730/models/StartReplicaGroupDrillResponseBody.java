// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartReplicaGroupDrillResponseBody extends TeaModel {
    /**
     * <p>The drill ID.</p>
     */
    @NameInMap("DrillId")
    public String drillId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartReplicaGroupDrillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartReplicaGroupDrillResponseBody self = new StartReplicaGroupDrillResponseBody();
        return TeaModel.build(map, self);
    }

    public StartReplicaGroupDrillResponseBody setDrillId(String drillId) {
        this.drillId = drillId;
        return this;
    }
    public String getDrillId() {
        return this.drillId;
    }

    public StartReplicaGroupDrillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
