// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("SyncArchitecture")
    public String syncArchitecture;

    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("UsedTime")
    public Integer usedTime;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Type")
    public String type;

    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    @NameInMap("DestinationRegion")
    public String destinationRegion;

    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    @NameInMap("ComputeUnit")
    public Integer computeUnit;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateDtsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDtsInstanceRequest self = new CreateDtsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDtsInstanceRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateDtsInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateDtsInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDtsInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDtsInstanceRequest setSyncArchitecture(String syncArchitecture) {
        this.syncArchitecture = syncArchitecture;
        return this;
    }
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    public CreateDtsInstanceRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public CreateDtsInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateDtsInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateDtsInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDtsInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDtsInstanceRequest setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    public CreateDtsInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateDtsInstanceRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public CreateDtsInstanceRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public CreateDtsInstanceRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public CreateDtsInstanceRequest setComputeUnit(Integer computeUnit) {
        this.computeUnit = computeUnit;
        return this;
    }
    public Integer getComputeUnit() {
        return this.computeUnit;
    }

    public CreateDtsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
