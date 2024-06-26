// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag-cuv4scs4obxhs****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    /**
     * <strong>example:</strong>
     * <p>newName</p>
     */
    @NameInMap("NewInstanceGroupName")
    public String newInstanceGroupName;

    /**
     * <strong>example:</strong>
     * <p>pg-2w97kp89gnsif****</p>
     */
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
