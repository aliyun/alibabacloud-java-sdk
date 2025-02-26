// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpgradeAndroidInstanceGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables the auto-payment feature. Make sure that your Alibaba Cloud account has sufficient balance.</li>
     * <li>false: disables the auto-payment feature. You need to manually complete the payment process.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The number of instances that you want to increase.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IncreaseNumberOfInstance")
    public Integer increaseNumberOfInstance;

    /**
     * <p>The ID of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-asguicdjh****</p>
     */
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
