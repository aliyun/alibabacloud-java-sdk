// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeDrdsInstancesResponseInstances instances;

    public static DescribeDrdsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponse self = new DescribeDrdsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsInstancesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDrdsInstancesResponse setInstances(DescribeDrdsInstancesResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeDrdsInstancesResponseInstances getInstances() {
        return this.instances;
    }

    public static class DescribeDrdsInstancesResponseInstancesInstanceVipsVip extends TeaModel {
        @NameInMap("IP")
        @Validation(required = true)
        public String IP;

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

        public static DescribeDrdsInstancesResponseInstancesInstanceVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseInstancesInstanceVipsVip self = new DescribeDrdsInstancesResponseInstancesInstanceVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeDrdsInstancesResponseInstancesInstanceVips extends TeaModel {
        @NameInMap("Vip")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstancesResponseInstancesInstanceVipsVip> vip;

        public static DescribeDrdsInstancesResponseInstancesInstanceVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseInstancesInstanceVips self = new DescribeDrdsInstancesResponseInstancesInstanceVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseInstancesInstanceVips setVip(java.util.List<DescribeDrdsInstancesResponseInstancesInstanceVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseInstancesInstanceVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds extends TeaModel {
        // ReadOnlyDBInstanceId
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds self = new DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDrdsInstancesResponseInstancesInstance extends TeaModel {
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

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("InstRole")
        @Validation(required = true)
        public String instRole;

        @NameInMap("InstanceSeries")
        @Validation(required = true)
        public String instanceSeries;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("ExpireDate")
        @Validation(required = true)
        public Long expireDate;

        @NameInMap("VersionAction")
        @Validation(required = true)
        public String versionAction;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MachineType")
        @Validation(required = true)
        public String machineType;

        @NameInMap("OrderInstanceId")
        @Validation(required = true)
        public String orderInstanceId;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ProductVersion")
        @Validation(required = true)
        public String productVersion;

        @NameInMap("Vips")
        @Validation(required = true)
        public DescribeDrdsInstancesResponseInstancesInstanceVips vips;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDrdsInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseInstancesInstance self = new DescribeDrdsInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseInstancesInstance setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setVips(DescribeDrdsInstancesResponseInstancesInstanceVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstancesResponseInstancesInstanceVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstancesResponseInstancesInstance setReadOnlyDBInstanceIds(DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstancesResponseInstancesInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

    }

    public static class DescribeDrdsInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstancesResponseInstancesInstance> instance;

        public static DescribeDrdsInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseInstances self = new DescribeDrdsInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseInstances setInstance(java.util.List<DescribeDrdsInstancesResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
