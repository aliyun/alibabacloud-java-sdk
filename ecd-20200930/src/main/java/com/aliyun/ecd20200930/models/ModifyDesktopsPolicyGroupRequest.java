// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopsPolicyGroupRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDesktopsPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopsPolicyGroupRequest self = new ModifyDesktopsPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopsPolicyGroupRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopsPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyDesktopsPolicyGroupRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public ModifyDesktopsPolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
