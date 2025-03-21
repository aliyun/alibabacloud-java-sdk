// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableConditionalAccessPolicyRequest extends TeaModel {
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
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableConditionalAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableConditionalAccessPolicyRequest self = new EnableConditionalAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableConditionalAccessPolicyRequest setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
        this.conditionalAccessPolicyId = conditionalAccessPolicyId;
        return this;
    }
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    public EnableConditionalAccessPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
