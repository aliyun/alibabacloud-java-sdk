// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiPolicyReference extends TeaModel {
    /**
     * <p>The policy attachment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-3c8ayyy</p>
     */
    @NameInMap("policyAttachmentId")
    public String policyAttachmentId;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pol-9f2exxx</p>
     */
    @NameInMap("policyId")
    public String policyId;

    public static HttpApiPolicyReference build(java.util.Map<String, ?> map) throws Exception {
        HttpApiPolicyReference self = new HttpApiPolicyReference();
        return TeaModel.build(map, self);
    }

    public HttpApiPolicyReference setPolicyAttachmentId(String policyAttachmentId) {
        this.policyAttachmentId = policyAttachmentId;
        return this;
    }
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

    public HttpApiPolicyReference setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
