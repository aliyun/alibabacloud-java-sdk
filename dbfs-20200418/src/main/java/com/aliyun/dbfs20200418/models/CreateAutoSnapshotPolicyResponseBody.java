// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sp-z5siir3iq3m**********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyResponseBody self = new CreateAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreateAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
