// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EBECBF12-2E34-41BE-8DE9-FC3700D4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTagsTag self = new DescribeInstancesResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag;

        public static DescribeInstancesResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTags self = new DescribeInstancesResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTags setTag(java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <strong>example:</strong>
         * <p>hb-bp1u0639js2h7****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("ColdStorageStatus")
        public String coldStorageStatus;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreDiskCount")
        public String coreDiskCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CoreDiskSize")
        public Integer coreDiskSize;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("CoreDiskType")
        public String coreDiskType;

        /**
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        @NameInMap("CoreInstanceType")
        public String coreInstanceType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreNodeCount")
        public Integer coreNodeCount;

        /**
         * <strong>example:</strong>
         * <p>2019-09-12T14:40:46</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>2019-09-12T14:40:46Z</p>
         */
        @NameInMap("CreatedTimeUTC")
        public String createdTimeUTC;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2019-10-12T14:40:46</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>2019-10-12T14:40:46Z</p>
         */
        @NameInMap("ExpireTimeUTC")
        public String expireTimeUTC;

        /**
         * <strong>example:</strong>
         * <p>hb-bp1u0639js2h7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDeletionProtection")
        public Boolean isDeletionProtection;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHa")
        public Boolean isHa;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("MajorVersion")
        public String majorVersion;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MasterDiskSize")
        public Integer masterDiskSize;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("MasterDiskType")
        public String masterDiskType;

        /**
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        @NameInMap("MasterInstanceType")
        public String masterInstanceType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MasterNodeCount")
        public Integer masterNodeCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModuleId")
        public Integer moduleId;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ModuleStackVersion")
        public String moduleStackVersion;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>2980****2123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-4f51d54g5****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesInstanceTags tags;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp120k6ixs4eoghz*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp191ipotq****dbqf</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstance setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstancesResponseBodyInstancesInstance setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeInstancesResponseBodyInstancesInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setColdStorageStatus(String coldStorageStatus) {
            this.coldStorageStatus = coldStorageStatus;
            return this;
        }
        public String getColdStorageStatus() {
            return this.coldStorageStatus;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCoreDiskCount(String coreDiskCount) {
            this.coreDiskCount = coreDiskCount;
            return this;
        }
        public String getCoreDiskCount() {
            return this.coreDiskCount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCoreDiskSize(Integer coreDiskSize) {
            this.coreDiskSize = coreDiskSize;
            return this;
        }
        public Integer getCoreDiskSize() {
            return this.coreDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCoreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }
        public String getCoreDiskType() {
            return this.coreDiskType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCoreInstanceType(String coreInstanceType) {
            this.coreInstanceType = coreInstanceType;
            return this;
        }
        public String getCoreInstanceType() {
            return this.coreInstanceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCoreNodeCount(Integer coreNodeCount) {
            this.coreNodeCount = coreNodeCount;
            return this;
        }
        public Integer getCoreNodeCount() {
            return this.coreNodeCount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreatedTimeUTC(String createdTimeUTC) {
            this.createdTimeUTC = createdTimeUTC;
            return this;
        }
        public String getCreatedTimeUTC() {
            return this.createdTimeUTC;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpireTimeUTC(String expireTimeUTC) {
            this.expireTimeUTC = expireTimeUTC;
            return this;
        }
        public String getExpireTimeUTC() {
            return this.expireTimeUTC;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setIsDeletionProtection(Boolean isDeletionProtection) {
            this.isDeletionProtection = isDeletionProtection;
            return this;
        }
        public Boolean getIsDeletionProtection() {
            return this.isDeletionProtection;
        }

        public DescribeInstancesResponseBodyInstancesInstance setIsHa(Boolean isHa) {
            this.isHa = isHa;
            return this;
        }
        public Boolean getIsHa() {
            return this.isHa;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMasterDiskSize(Integer masterDiskSize) {
            this.masterDiskSize = masterDiskSize;
            return this;
        }
        public Integer getMasterDiskSize() {
            return this.masterDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMasterDiskType(String masterDiskType) {
            this.masterDiskType = masterDiskType;
            return this;
        }
        public String getMasterDiskType() {
            return this.masterDiskType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMasterInstanceType(String masterInstanceType) {
            this.masterInstanceType = masterInstanceType;
            return this;
        }
        public String getMasterInstanceType() {
            return this.masterInstanceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMasterNodeCount(Integer masterNodeCount) {
            this.masterNodeCount = masterNodeCount;
            return this;
        }
        public Integer getMasterNodeCount() {
            return this.masterNodeCount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setModuleId(Integer moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Integer getModuleId() {
            return this.moduleId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setModuleStackVersion(String moduleStackVersion) {
            this.moduleStackVersion = moduleStackVersion;
            return this;
        }
        public String getModuleStackVersion() {
            return this.moduleStackVersion;
        }

        public DescribeInstancesResponseBodyInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstance setTags(DescribeInstancesResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstance(java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
