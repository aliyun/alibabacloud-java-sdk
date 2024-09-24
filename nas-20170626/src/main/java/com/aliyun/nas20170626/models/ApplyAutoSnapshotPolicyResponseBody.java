// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyResponseBody self = new ApplyAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
