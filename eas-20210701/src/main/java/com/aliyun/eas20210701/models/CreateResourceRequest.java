// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("Zone")
    public String zone;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateResourceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateResourceRequest setEcsInstanceCount(Integer ecsInstanceCount) {
        this.ecsInstanceCount = ecsInstanceCount;
        return this;
    }
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    public CreateResourceRequest setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public CreateResourceRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateResourceRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
