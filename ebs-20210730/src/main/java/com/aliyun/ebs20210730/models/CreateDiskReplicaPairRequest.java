// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationDiskId")
    public String destinationDiskId;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("PairName")
    public String pairName;

    @NameInMap("Period")
    public Long period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RPO")
    public Long RPO;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceZoneId")
    public String sourceZoneId;

    public static CreateDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairRequest self = new CreateDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateDiskReplicaPairRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDiskReplicaPairRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiskReplicaPairRequest setDestinationDiskId(String destinationDiskId) {
        this.destinationDiskId = destinationDiskId;
        return this;
    }
    public String getDestinationDiskId() {
        return this.destinationDiskId;
    }

    public CreateDiskReplicaPairRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CreateDiskReplicaPairRequest setDestinationZoneId(String destinationZoneId) {
        this.destinationZoneId = destinationZoneId;
        return this;
    }
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    public CreateDiskReplicaPairRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateDiskReplicaPairRequest setPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }
    public String getPairName() {
        return this.pairName;
    }

    public CreateDiskReplicaPairRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateDiskReplicaPairRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDiskReplicaPairRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public CreateDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiskReplicaPairRequest setSourceZoneId(String sourceZoneId) {
        this.sourceZoneId = sourceZoneId;
        return this;
    }
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

}
