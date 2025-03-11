// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Data")
    public DescribeDrdsInstanceResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4F76641-BA45-4320-BE7C-9C62CFDAC9B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceResponseBody self = new DescribeDrdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceResponseBody setData(DescribeDrdsInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class DescribeDrdsInstanceResponseBodyDataVipsVip extends TeaModel {
        /**
         * <p>The domain name that is mapped to the VIP.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen1243as.drds.aliyuncs.com</p>
         */
        @NameInMap("Dns")
        public String dns;

        /**
         * <p>The number of remaining days before the VIP expires.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExpireDays")
        public Long expireDays;

        /**
         * <p>The ports that are opened on the VIP.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        @NameInMap("RemoveWeight")
        public Boolean removeWeight;

        /**
         * <p>The type of the VIP. Valid values: intranet and internet.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp**********</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp***********</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeDrdsInstanceResponseBodyDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataVipsVip self = new DescribeDrdsInstanceResponseBodyDataVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
            return this.dns;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setExpireDays(Long expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Long getExpireDays() {
            return this.expireDays;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setRemoveWeight(Boolean removeWeight) {
            this.removeWeight = removeWeight;
            return this;
        }
        public Boolean getRemoveWeight() {
            return this.removeWeight;
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

    public static class DescribeDrdsInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The commodity code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drdsPost</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The timestamp that indicates when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1568620311000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen1243as</p>
         */
        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        /**
         * <p>The timestamp that indicates when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>4724323200000</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MASTER</strong>: The instance is a primary instance.</li>
         * <li><strong>SLAVE</strong>: The instance is a read-only instance to analyze complex queries</li>
         * <li><strong>SLAVE_FLOW</strong>: The instance is a read-only instance for high-concurrency scenarios</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MASTER</p>
         */
        @NameInMap("InstRole")
        public String instRole;

        /**
         * <p>The instance series of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds.sn2.4c16g</p>
         */
        @NameInMap("InstanceSeries")
        public String instanceSeries;

        /**
         * <p>The specification of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drds.sn2.4c16g.8C32G</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The tag of the instance. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The instance is a standard instance.</li>
         * <li><strong>HA</strong>: The instance is a high-availability (HA) instance.</li>
         * <li><strong>VPC</strong>: The instance is a VPC-based instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The machine type of the instance. The value of this parameter is <strong>ecs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The ID of the primary instance.</p>
         * <blockquote>
         * <p> This parameter is returned only when the instance is a primary instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>drdssen1243as</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The MySQL version that is supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MysqlVersion")
        public Integer mysqlVersion;

        /**
         * <p>The network type of the instance. Valid values: CLASSIC and VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>CLASSIC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the purchased instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen12****</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <p>The version of .</p>
         * 
         * <strong>example:</strong>
         * <p>5.3.*</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>The details about each read-only instance that is associated with the instance.</p>
         */
        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        /**
         * <p>The ID of the region in which the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs. The value of this parameter can be null.</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The state of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the instance used for storage.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The type of the instance. Valid values: PRIVATE and PUBLIC. The value of PRIVATE indicates that the instance is a dedicated instance. The value of PUBLIC indicates that the instance is a shared instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the instance. The value of this parameter is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Version")
        public Long version;

        /**
         * <p>Indicates whether the version of the instance can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgradeable</p>
         */
        @NameInMap("VersionAction")
        public String versionAction;

        /**
         * <p>The list of returned virtual IP addresses (VIPs).</p>
         */
        @NameInMap("Vips")
        public DescribeDrdsInstanceResponseBodyDataVips vips;

        /**
         * <p>The ID of the instance that is deployed in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen12****</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The ID of the zone in which the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDrdsInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyData self = new DescribeDrdsInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstanceResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeDrdsInstanceResponseBodyData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstanceResponseBodyData setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstanceResponseBodyData setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstanceResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstanceResponseBodyData setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstanceResponseBodyData setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setMysqlVersion(Integer mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public Integer getMysqlVersion() {
            return this.mysqlVersion;
        }

        public DescribeDrdsInstanceResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstanceResponseBodyData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsInstanceResponseBodyData setReadOnlyDBInstanceIds(DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstanceResponseBodyDataReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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

        public DescribeDrdsInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstanceResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDrdsInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstanceResponseBodyData setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstanceResponseBodyData setVips(DescribeDrdsInstanceResponseBodyDataVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstanceResponseBodyDataVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstanceResponseBodyData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
