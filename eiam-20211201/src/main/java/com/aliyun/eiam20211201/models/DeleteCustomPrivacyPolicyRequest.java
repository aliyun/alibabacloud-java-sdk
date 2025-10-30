// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCustomPrivacyPolicyRequest extends TeaModel {
    /**
     * <p>自定义条款ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pp_xxxxx</p>
     */
    @NameInMap("CustomPrivacyPolicyId")
    public String customPrivacyPolicyId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCustomPrivacyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomPrivacyPolicyRequest self = new DeleteCustomPrivacyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomPrivacyPolicyRequest setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
        this.customPrivacyPolicyId = customPrivacyPolicyId;
        return this;
    }
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    public DeleteCustomPrivacyPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
