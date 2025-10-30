// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCustomPrivacyPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pp_neagxpoznsjdtxxxxx</p>
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

    public static EnableCustomPrivacyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomPrivacyPolicyRequest self = new EnableCustomPrivacyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableCustomPrivacyPolicyRequest setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
        this.customPrivacyPolicyId = customPrivacyPolicyId;
        return this;
    }
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    public EnableCustomPrivacyPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
