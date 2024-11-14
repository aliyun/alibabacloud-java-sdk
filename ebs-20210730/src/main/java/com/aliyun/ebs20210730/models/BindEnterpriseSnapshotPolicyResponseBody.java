// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class BindEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF4CA176-3358-5B74-B317-B1908B4B1F7D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindEnterpriseSnapshotPolicyResponseBody self = new BindEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public BindEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
