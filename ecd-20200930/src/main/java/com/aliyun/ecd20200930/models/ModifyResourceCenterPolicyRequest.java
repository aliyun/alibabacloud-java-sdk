// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyResourceCenterPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computer policies that you want to associate with cloud computers.</p>
     * <blockquote>
     * <p> You can specify up to one cloud computer policy that takes effect globally, and up to four cloud computer policies that apply to specific IP addresses. If multiple cloud computer policies are configured for global enforcement, only the earliest-associated policy will take effect</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    /**
     * <p>The policy type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>general: a general policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("PolicyGroupType")
    public String policyGroupType;

    /**
     * <p>The service type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>app: cloud applications.</li>
     * <li>resourceGroup: resource groups.</li>
     * <li>desktop: cloud computers.</li>
     * <li>desktopGroup: cloud computer shares.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The resource IDs. You can specify up to 100 resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The region ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>app: cloud applications.</li>
     * <li>desktop: cloud computers.</li>
     * </ul>
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
