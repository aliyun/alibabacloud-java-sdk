// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of returned instances.</p>
     */
    @NameInMap("Instances")
    public DescribeDrdsInstancesResponseBodyInstances instances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8734773E-7B21-4A22-9106-CBD245F8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeDrdsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponseBody self = new DescribeDrdsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponseBody setInstances(DescribeDrdsInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeDrdsInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeDrdsInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds self = new DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip extends TeaModel {
        /**
         * <p>The virtual IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.<em><strong>.</strong></em></p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ports that are opened on the VIP.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The type of the VIP. Valid values:</p>
         * <ul>
         * <li>intranet: a private IP address</li>
         * <li>internet: a public IP address</li>
         * </ul>
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
         * <p>vpc-bpxxxxxxxxxxxy</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxxxxxxxxx96</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The domain name that is mapped to the VIP.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen1243as.drds.aliyuncs.com</p>
         */
        @NameInMap("dns")
        public String dns;

        public static DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip self = new DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
            return this.dns;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyInstancesInstanceVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip> vip;

        public static DescribeDrdsInstancesResponseBodyInstancesInstanceVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstanceVips self = new DescribeDrdsInstancesResponseBodyInstancesInstanceVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVips setVip(java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <p>The commodity code of the service.</p>
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
         * <p>drdssen12****</p>
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
         * <li>MASTER: The instance is a primary instance.</li>
         * <li>SLAVE: The instance is a read-only instance to analyze complex queries.</li>
         * <li>SLAVE_FLOW: The instance is a read-only instance for high-concurrency scenarios.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MASTER</p>
         */
        @NameInMap("InstRole")
        public String instRole;

        /**
         * <p>The instance series.</p>
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
         * <p>The machine type of the instance. Valid value: ecs.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The ID of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen12****</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong></li>
         * <li><strong>VPC</strong></li>
         * </ul>
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
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>The IDs of read-only instances that are associated with the instance.</p>
         */
        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2ljh3ye4****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: The returned instance is a shared instance.</li>
         * <li><strong>PRIVATE</strong>: The returned instance is a dedicated instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the instance.</p>
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
         * <p>Upgradable</p>
         */
        @NameInMap("VersionAction")
        public String versionAction;

        /**
         * <p>The list of returned virtual IP addresses (VIPs).</p>
         */
        @NameInMap("Vips")
        public DescribeDrdsInstancesResponseBodyInstancesInstanceVips vips;

        /**
         * <p>The ID of the instance that is deployed in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>drdssen12****</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp**********</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone in which the resource is located.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxxxxxxxxx96</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>starter</strong>: Starter Edition</li>
         * <li><strong>enterprise</strong>: Enterprise Edition</li>
         * <li><strong>standard</strong>: Standard Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("series")
        public String series;

        public static DescribeDrdsInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstance self = new DescribeDrdsInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setReadOnlyDBInstanceIds(DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVips(DescribeDrdsInstancesResponseBodyInstancesInstanceVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyInstancesInstanceVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstance> instance;

        public static DescribeDrdsInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstances self = new DescribeDrdsInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstances setInstance(java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
