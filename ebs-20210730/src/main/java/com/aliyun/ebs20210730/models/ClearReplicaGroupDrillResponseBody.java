// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearReplicaGroupDrillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearReplicaGroupDrillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearReplicaGroupDrillResponseBody self = new ClearReplicaGroupDrillResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearReplicaGroupDrillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
