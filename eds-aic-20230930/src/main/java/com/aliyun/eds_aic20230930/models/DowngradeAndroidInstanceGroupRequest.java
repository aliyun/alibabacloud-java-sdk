// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DowngradeAndroidInstanceGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances that you want to delete.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>Specifies whether to enable the auto-payment feature. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables the auto-payment feature. Ensure your account has sufficient balance to use this feature.</li>
     * <li>false: disables the auto-payment feature. This requires manual payment each time you place an order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the instance group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-cuv4scs4obxhs****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    public static DowngradeAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DowngradeAndroidInstanceGroupRequest self = new DowngradeAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DowngradeAndroidInstanceGroupRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public DowngradeAndroidInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public DowngradeAndroidInstanceGroupRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

}
