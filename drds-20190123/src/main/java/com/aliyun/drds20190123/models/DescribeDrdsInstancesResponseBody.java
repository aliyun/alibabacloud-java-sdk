// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Instances")
    public DescribeDrdsInstancesResponseBodyInstances instances;

    public static DescribeDrdsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponseBody self = new DescribeDrdsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeDrdsInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDrdsInstancesResponseBody setInstances(DescribeDrdsInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeDrdsInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public static class DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Type")
        public String type;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("Port")
        public String port;

        @NameInMap("IP")
        public String IP;

        public static DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip self = new DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstanceVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
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

    public static class DescribeDrdsInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("VersionAction")
        public String versionAction;

        @NameInMap("InstanceSeries")
        public String instanceSeries;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Label")
        public String label;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public Long version;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        @NameInMap("ExpireDate")
        public Long expireDate;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        @NameInMap("InstRole")
        public String instRole;

        @NameInMap("Vips")
        public DescribeDrdsInstancesResponseBodyInstancesInstanceVips vips;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDrdsInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyInstancesInstance self = new DescribeDrdsInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public DescribeDrdsInstancesResponseBodyInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

        public DescribeDrdsInstancesResponseBodyInstancesInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setVips(DescribeDrdsInstancesResponseBodyInstancesInstanceVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyInstancesInstanceVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstancesResponseBodyInstancesInstance setReadOnlyDBInstanceIds(DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyInstancesInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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
