// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DiskIds")
    @Validation(required = true)
    public String diskIds;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiskChargeType")
    public String diskChargeType;

    public static ModifyDiskChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeRequest self = new ModifyDiskChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskChargeTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskChargeTypeRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public ModifyDiskChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDiskChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskChargeTypeRequest setDiskChargeType(String diskChargeType) {
        this.diskChargeType = diskChargeType;
        return this;
    }
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

}
