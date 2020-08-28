// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ClientToken")
    public String clientToken;

    public static PurchaseReservedInstancesOfferingRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingRequest self = new PurchaseReservedInstancesOfferingRequest();
        return TeaModel.build(map, self);
    }

}
