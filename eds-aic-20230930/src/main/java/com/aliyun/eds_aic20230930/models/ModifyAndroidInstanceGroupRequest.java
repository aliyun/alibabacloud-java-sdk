// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceGroupRequest extends TeaModel {
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    @NameInMap("NewInstanceGroupName")
    public String newInstanceGroupName;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    public static ModifyAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAndroidInstanceGroupRequest self = new ModifyAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAndroidInstanceGroupRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public ModifyAndroidInstanceGroupRequest setNewInstanceGroupName(String newInstanceGroupName) {
        this.newInstanceGroupName = newInstanceGroupName;
        return this;
    }
    public String getNewInstanceGroupName() {
        return this.newInstanceGroupName;
    }

    public ModifyAndroidInstanceGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

}
