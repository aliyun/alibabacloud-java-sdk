// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Role")
    @Validation(required = true)
    public String role;

    @NameInMap("OppositeRegionId")
    @Validation(required = true)
    public String oppositeRegionId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("RouterType")
    @Validation(required = true)
    public String routerType;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static CreateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceRequest self = new CreateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
