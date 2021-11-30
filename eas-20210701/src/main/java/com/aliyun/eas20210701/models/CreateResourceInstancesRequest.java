// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesRequest extends TeaModel {
    // 是否自动续费
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    // 付费类型，预付费PrePaid，后付费PostPaid
    @NameInMap("ChargeType")
    public String chargeType;

    // 新创建的实例个数，(0, 100]
    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    // 实例机型，对应ecs机型
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    // 用户自这义数据，小于 16KB
    @NameInMap("UserData")
    public String userData;

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

    public CreateResourceInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
