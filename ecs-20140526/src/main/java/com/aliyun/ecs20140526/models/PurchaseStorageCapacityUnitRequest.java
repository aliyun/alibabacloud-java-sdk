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

    public PurchaseStorageCapacityUnitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PurchaseStorageCapacityUnitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PurchaseStorageCapacityUnitRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public PurchaseStorageCapacityUnitRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PurchaseStorageCapacityUnitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PurchaseStorageCapacityUnitRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseStorageCapacityUnitRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public PurchaseStorageCapacityUnitRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public PurchaseStorageCapacityUnitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PurchaseStorageCapacityUnitRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

}
