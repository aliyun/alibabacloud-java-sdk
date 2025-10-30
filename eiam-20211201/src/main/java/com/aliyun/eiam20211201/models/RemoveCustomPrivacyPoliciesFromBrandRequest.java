// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveCustomPrivacyPoliciesFromBrandRequest extends TeaModel {
    /**
     * <p>品牌化Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>brand_xxxx</p>
     */
    @NameInMap("BrandId")
    public String brandId;

    /**
     * <p>条款ID列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomPrivacyPolicyIds")
    public java.util.List<String> customPrivacyPolicyIds;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RemoveCustomPrivacyPoliciesFromBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCustomPrivacyPoliciesFromBrandRequest self = new RemoveCustomPrivacyPoliciesFromBrandRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCustomPrivacyPoliciesFromBrandRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public RemoveCustomPrivacyPoliciesFromBrandRequest setCustomPrivacyPolicyIds(java.util.List<String> customPrivacyPolicyIds) {
        this.customPrivacyPolicyIds = customPrivacyPolicyIds;
        return this;
    }
    public java.util.List<String> getCustomPrivacyPolicyIds() {
        return this.customPrivacyPolicyIds;
    }

    public RemoveCustomPrivacyPoliciesFromBrandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
