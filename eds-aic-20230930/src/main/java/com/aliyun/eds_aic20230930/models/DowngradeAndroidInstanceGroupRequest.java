// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DowngradeAndroidInstanceGroupRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>This parameter is required.</p>
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
