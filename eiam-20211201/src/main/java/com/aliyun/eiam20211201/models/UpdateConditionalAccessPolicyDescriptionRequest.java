// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateConditionalAccessPolicyDescriptionRequest extends TeaModel {
    /**
     * <p>Conditional Access Policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap_11111</p>
     */
    @NameInMap("ConditionalAccessPolicyId")
    public String conditionalAccessPolicyId;

    /**
     * <p>Description of the conditional access policy</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateConditionalAccessPolicyDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConditionalAccessPolicyDescriptionRequest self = new UpdateConditionalAccessPolicyDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConditionalAccessPolicyDescriptionRequest setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
        this.conditionalAccessPolicyId = conditionalAccessPolicyId;
        return this;
    }
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    public UpdateConditionalAccessPolicyDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConditionalAccessPolicyDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
