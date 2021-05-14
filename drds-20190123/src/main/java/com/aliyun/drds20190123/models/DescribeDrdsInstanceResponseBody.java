// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDrdsInstanceResponseBodyData data;

    public static DescribeDrdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceResponseBody self = new DescribeDrdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceResponseBody setData(DescribeDrdsInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceResponseBodyDataVipsVip extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("Dns")
        public String dns;

        @NameInMap("Port")
        public String port;

        @NameInMap("ExpireDays")
        public Long expireDays;

        public static DescribeDrdsInstanceResponseBodyDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataVipsVip self = new DescribeDrdsInstanceResponseBodyDataVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
            return this.dns;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setExpireDays(Long expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Long getExpireDays() {
            return this.expireDays;
        }

    }

    public static class DescribeDrdsInstanceResponseBodyDataVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> vip;

        public static DescribeDrdsInstanceResponseBodyDataVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataVips self = new DescribeDrdsInstanceResponseBodyDataVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataVips setVip(java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds self = new DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDrdsInstanceResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("VersionAction")
        public String versionAction;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Label")
        public String label;

        @NameInMap("MysqlVersion")
        public Integer mysqlVersion;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public Long version;

        @NameInMap("ExpireDate")
        public Long expireDate;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("InstanceSeries")
        public String instanceSeries;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstRole")
        public String instRole;

        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        @NameInMap("Vips")
        public DescribeDrdsInstanceResponseBodyDataVips vips;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDrdsInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyData self = new DescribeDrdsInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstanceResponseBodyData setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstanceResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDrdsInstanceResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstanceResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstanceResponseBodyData setMysqlVersion(Integer mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public Integer getMysqlVersion() {
            return this.mysqlVersion;
        }

        public DescribeDrdsInstanceResponseBodyData setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstanceResponseBodyData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstanceResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstanceResponseBodyData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeDrdsInstanceResponseBodyData setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstanceResponseBodyData setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstanceResponseBodyData setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstanceResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDrdsInstanceResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsInstanceResponseBodyData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstanceResponseBodyData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setVips(DescribeDrdsInstanceResponseBodyDataVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstanceResponseBodyDataVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstanceResponseBodyData setReadOnlyDBInstanceIds(DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

    }

}
