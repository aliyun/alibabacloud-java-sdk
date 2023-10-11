// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartPairDrillResponseBody extends TeaModel {
    @NameInMap("DrillId")
    public String drillId;

    @NameInMap("RequestId")
    public String requestId;

    public static StartPairDrillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPairDrillResponseBody self = new StartPairDrillResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPairDrillResponseBody setDrillId(String drillId) {
        this.drillId = drillId;
        return this;
    }
    public String getDrillId() {
        return this.drillId;
    }

    public StartPairDrillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
