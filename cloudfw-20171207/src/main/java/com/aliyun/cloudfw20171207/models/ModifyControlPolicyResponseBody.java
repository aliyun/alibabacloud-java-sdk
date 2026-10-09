// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is a dry run. A value of true indicates that only a dry run was performed and no actual modification was made.</p>
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
