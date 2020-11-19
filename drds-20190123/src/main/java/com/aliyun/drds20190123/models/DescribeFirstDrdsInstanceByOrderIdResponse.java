// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeFirstDrdsInstanceByOrderIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeFirstDrdsInstanceByOrderIdResponseData data;

    public static DescribeFirstDrdsInstanceByOrderIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirstDrdsInstanceByOrderIdResponse self = new DescribeFirstDrdsInstanceByOrderIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirstDrdsInstanceByOrderIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirstDrdsInstanceByOrderIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFirstDrdsInstanceByOrderIdResponse setData(DescribeFirstDrdsInstanceByOrderIdResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeFirstDrdsInstanceByOrderIdResponseData getData() {
        return this.data;
    }

    public static class DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip extends TeaModel {
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

        public static DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip self = new DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
            return this.dns;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setExpireDays(Long expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Long getExpireDays() {
            return this.expireDays;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeFirstDrdsInstanceByOrderIdResponseDataVips extends TeaModel {
        @NameInMap("Vip")
        @Validation(required = true)
        public java.util.List<DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip> vip;

        public static DescribeFirstDrdsInstanceByOrderIdResponseDataVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstDrdsInstanceByOrderIdResponseDataVips self = new DescribeFirstDrdsInstanceByOrderIdResponseDataVips();
            return TeaModel.build(map, self);
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataVips setVip(java.util.List<DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeFirstDrdsInstanceByOrderIdResponseDataVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds extends TeaModel {
        // ReadOnlyDBInstanceId
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds self = new DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeFirstDrdsInstanceByOrderIdResponseData extends TeaModel {
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

        @NameInMap("Vips")
        @Validation(required = true)
        public DescribeFirstDrdsInstanceByOrderIdResponseDataVips vips;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeFirstDrdsInstanceByOrderIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirstDrdsInstanceByOrderIdResponseData self = new DescribeFirstDrdsInstanceByOrderIdResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setMysqlVersion(Integer mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public Integer getMysqlVersion() {
            return this.mysqlVersion;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setVips(DescribeFirstDrdsInstanceByOrderIdResponseDataVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeFirstDrdsInstanceByOrderIdResponseDataVips getVips() {
            return this.vips;
        }

        public DescribeFirstDrdsInstanceByOrderIdResponseData setReadOnlyDBInstanceIds(DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeFirstDrdsInstanceByOrderIdResponseDataReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

    }

}
