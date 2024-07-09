// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>63740E03-1B4B-5A18-AC27-2745A4F2****</p>
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
