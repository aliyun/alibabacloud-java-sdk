// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Capacity")
    @Validation(required = true)
    public Integer capacity;

    @NameInMap("Description")
    public String description;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Amount")
    public Integer amount;

    public static PurchaseStorageCapacityUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitRequest self = new PurchaseStorageCapacityUnitRequest();
        return TeaModel.build(map, self);
    }

}
