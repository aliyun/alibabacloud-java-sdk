// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is for a successful dry run. A value of true indicates that only the precheck is completed and no actual changes are made. This field is not returned or is set to false for actual calls.</p>
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

    public static DeleteControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyResponseBody self = new DeleteControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
