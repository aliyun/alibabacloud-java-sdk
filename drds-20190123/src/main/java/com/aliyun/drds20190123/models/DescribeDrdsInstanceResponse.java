// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDrdsInstanceResponseData data;

    public static DescribeDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceResponse self = new DescribeDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceResponse setData(DescribeDrdsInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceResponseData getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceResponseDataVipsVip extends TeaModel {
        @NameInMap("Dns")
        @Validation(required = true)
        public String dns;

        @NameInMap("ExpireDays")
        @Validation(required = true)
        public Long expireDays;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VswitchId")
        @Validation(required = true)
        public String vswitchId;

        public static DescribeDrdsInstanceResponseDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseDataVipsVip self = new DescribeDrdsInstanceResponseDataVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseDataVipsVip setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
            return this.dns;
        }

        public DescribeDrdsInstanceResponseDataVipsVip setExpireDays(Long expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Long getExpireDays() {
            return this.expireDays;
        }

        public DescribeDrdsInstanceResponseDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstanceResponseDataVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseDataVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstanceResponseDataVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeDrdsInstanceResponseDataVips extends TeaModel {
        @NameInMap("Vip")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstanceResponseDataVipsVip> vip;

        public static DescribeDrdsInstanceResponseDataVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseDataVips self = new DescribeDrdsInstanceResponseDataVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseDataVips setVip(java.util.List<DescribeDrdsInstanceResponseDataVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceResponseDataVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds extends TeaModel {
        // ReadOnlyDBInstanceId
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds self = new DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDrdsInstanceResponseData extends TeaModel {
        @NameInMap("DrdsInstanceId")
        @Validation(required = true)
        public String drdsInstanceId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Version")
        @Validation(required = true)
        public Long version;

        @NameInMap("InstanceSeries")
        @Validation(required = true)
        public String instanceSeries;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("InstRole")
        @Validation(required = true)
        public String instRole;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("ExpireDate")
        @Validation(required = true)
        public Long expireDate;

        @NameInMap("VersionAction")
        @Validation(required = true)
        public String versionAction;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("MachineType")
        @Validation(required = true)
        public String machineType;

        @NameInMap("OrderInstanceId")
        @Validation(required = true)
        public String orderInstanceId;

        @NameInMap("MysqlVersion")
        @Validation(required = true)
        public Integer mysqlVersion;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Vips")
        @Validation(required = true)
        public DescribeDrdsInstanceResponseDataVips vips;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDrdsInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseData self = new DescribeDrdsInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstanceResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstanceResponseData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsInstanceResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstanceResponseData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstanceResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstanceResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstanceResponseData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstanceResponseData setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstanceResponseData setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstanceResponseData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstanceResponseData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstanceResponseData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstanceResponseData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeDrdsInstanceResponseData setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstanceResponseData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstanceResponseData setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstanceResponseData setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstanceResponseData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstanceResponseData setMysqlVersion(Integer mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public Integer getMysqlVersion() {
            return this.mysqlVersion;
        }

        public DescribeDrdsInstanceResponseData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDrdsInstanceResponseData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDrdsInstanceResponseData setVips(DescribeDrdsInstanceResponseDataVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstanceResponseDataVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstanceResponseData setReadOnlyDBInstanceIds(DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstanceResponseDataReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

    }

}
