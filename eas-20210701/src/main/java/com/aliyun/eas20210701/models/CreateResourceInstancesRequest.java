// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesRequest extends TeaModel {
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

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Zone")
    public String zone;

    public static CreateResourceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInstancesRequest self = new CreateResourceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceInstancesRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateResourceInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateResourceInstancesRequest setEcsInstanceCount(Integer ecsInstanceCount) {
        this.ecsInstanceCount = ecsInstanceCount;
        return this;
    }
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    public CreateResourceInstancesRequest setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public CreateResourceInstancesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateResourceInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateResourceInstancesRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
