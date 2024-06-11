// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpgradeAndroidInstanceGroupRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("IncreaseNumberOfInstance")
    public Integer increaseNumberOfInstance;

    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    public static UpgradeAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAndroidInstanceGroupRequest self = new UpgradeAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAndroidInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeAndroidInstanceGroupRequest setIncreaseNumberOfInstance(Integer increaseNumberOfInstance) {
        this.increaseNumberOfInstance = increaseNumberOfInstance;
        return this;
    }
    public Integer getIncreaseNumberOfInstance() {
        return this.increaseNumberOfInstance;
    }

    public UpgradeAndroidInstanceGroupRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

}
