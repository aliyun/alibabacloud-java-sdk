// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyResponseBody self = new CancelAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
