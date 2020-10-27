// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostClusterId")
    @Validation(required = true)
    public String dedicatedHostClusterId;

    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    @NameInMap("Description")
    public String description;

    public static ModifyDedicatedHostClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeRequest self = new ModifyDedicatedHostClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostClusterAttributeRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyDedicatedHostClusterAttributeRequest setDedicatedHostClusterName(String dedicatedHostClusterName) {
        this.dedicatedHostClusterName = dedicatedHostClusterName;
        return this;
    }
    public String getDedicatedHostClusterName() {
        return this.dedicatedHostClusterName;
    }

    public ModifyDedicatedHostClusterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
