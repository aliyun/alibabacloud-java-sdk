// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class BindEnterpriseSnapshotPolicyResponseBody extends TeaModel {
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
