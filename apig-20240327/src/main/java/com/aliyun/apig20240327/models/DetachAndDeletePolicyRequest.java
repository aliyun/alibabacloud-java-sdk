// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DetachAndDeletePolicyRequest extends TeaModel {
    /**
     * <p>The policy association ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pr-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("policyAttachmentId")
    public String policyAttachmentId;

    public static DetachAndDeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAndDeletePolicyRequest self = new DetachAndDeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachAndDeletePolicyRequest setPolicyAttachmentId(String policyAttachmentId) {
        this.policyAttachmentId = policyAttachmentId;
        return this;
    }
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

}
