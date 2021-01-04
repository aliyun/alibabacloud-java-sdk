// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class CreateDataCenterRequest extends TeaModel {
    @NameInMap("PayType")
    public String payType;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterName")
    public String dataCenterName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public Integer diskSize;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    public static CreateDataCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCenterRequest self = new CreateDataCenterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCenterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDataCenterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDataCenterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDataCenterRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDataCenterRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateDataCenterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataCenterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataCenterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDataCenterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDataCenterRequest setDataCenterName(String dataCenterName) {
        this.dataCenterName = dataCenterName;
        return this;
    }
    public String getDataCenterName() {
        return this.dataCenterName;
    }

    public CreateDataCenterRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateDataCenterRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CreateDataCenterRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateDataCenterRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateDataCenterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDataCenterRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
