// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyResourceCenterPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("PolicyGroupType")
    public String policyGroupType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ModifyResourceCenterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceCenterPolicyRequest self = new ModifyResourceCenterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceCenterPolicyRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public ModifyResourceCenterPolicyRequest setPolicyGroupType(String policyGroupType) {
        this.policyGroupType = policyGroupType;
        return this;
    }
    public String getPolicyGroupType() {
        return this.policyGroupType;
    }

    public ModifyResourceCenterPolicyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyResourceCenterPolicyRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ModifyResourceCenterPolicyRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public ModifyResourceCenterPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
