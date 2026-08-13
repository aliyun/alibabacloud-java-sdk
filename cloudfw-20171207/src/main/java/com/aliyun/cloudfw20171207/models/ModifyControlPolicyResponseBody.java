// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether this is a successful dry run response. A value of true indicates that only the dry run was completed and no actual modification was performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyResponseBody self = new ModifyControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
