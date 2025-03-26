// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCenterPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteCenterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenterPolicyRequest self = new DeleteCenterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCenterPolicyRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public DeleteCenterPolicyRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public DeleteCenterPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCenterPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
