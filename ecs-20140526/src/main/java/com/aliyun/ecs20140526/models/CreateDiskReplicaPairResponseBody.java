// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairResponseBody extends TeaModel {
    @NameInMap("PairId")
    public String pairId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairResponseBody self = new CreateDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairResponseBody setPairId(String pairId) {
        this.pairId = pairId;
        return this;
    }
    public String getPairId() {
        return this.pairId;
    }

    public CreateDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
