// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicySetRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    /**
     * <p>The source platform.</p>
     * 
     * <strong>example:</strong>
     * <p>Manuel</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    public static CreatePolicySetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicySetRequest self = new CreatePolicySetRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicySetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicySetRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

    public CreatePolicySetRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

}
