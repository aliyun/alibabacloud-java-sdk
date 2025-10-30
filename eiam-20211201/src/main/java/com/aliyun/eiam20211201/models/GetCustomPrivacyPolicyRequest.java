// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomPrivacyPolicyRequest extends TeaModel {
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

    public static GetCustomPrivacyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomPrivacyPolicyRequest self = new GetCustomPrivacyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomPrivacyPolicyRequest setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
        this.customPrivacyPolicyId = customPrivacyPolicyId;
        return this;
    }
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    public GetCustomPrivacyPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
