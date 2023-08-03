// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
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

    public DescribeInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeInstancesResponseBodyInstancesHostAliases extends TeaModel {
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        @NameInMap("Ip")
        public String ip;

        public static DescribeInstancesResponseBodyInstancesHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesHostAliases self = new DescribeInstancesResponseBodyInstancesHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesHostAliases setHostNames(java.util.List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public java.util.List<String> getHostNames() {
            return this.hostNames;
        }

        public DescribeInstancesResponseBodyInstancesHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static DescribeInstancesResponseBodyInstancesResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceSpec self = new DescribeInstancesResponseBodyInstancesResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesStorageOss extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        public static DescribeInstancesResponseBodyInstancesStorageOss build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesStorageOss self = new DescribeInstancesResponseBodyInstancesStorageOss();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesStorageOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesStorage extends TeaModel {
        @NameInMap("Oss")
        public DescribeInstancesResponseBodyInstancesStorageOss oss;

        public static DescribeInstancesResponseBodyInstancesStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesStorage self = new DescribeInstancesResponseBodyInstancesStorage();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesStorage setOss(DescribeInstancesResponseBodyInstancesStorageOss oss) {
            this.oss = oss;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesStorageOss getOss() {
            return this.oss;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesTags self = new DescribeInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("AskClusterId")
        public String askClusterId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("HostAliases")
        public java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> hostAliases;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OrderState")
        public String orderState;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        @NameInMap("ResourceExpiredTime")
        public Long resourceExpiredTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceSpec")
        public DescribeInstancesResponseBodyInstancesResourceSpec resourceSpec;

        @NameInMap("Storage")
        public DescribeInstancesResponseBodyInstancesStorage storage;

        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> tags;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setAskClusterId(String askClusterId) {
            this.askClusterId = askClusterId;
            return this;
        }
        public String getAskClusterId() {
            return this.askClusterId;
        }

        public DescribeInstancesResponseBodyInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstancesResponseBodyInstances setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public DescribeInstancesResponseBodyInstances setHostAliases(java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstances setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

        public DescribeInstancesResponseBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstancesResponseBodyInstances setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public DescribeInstancesResponseBodyInstances setResourceExpiredTime(Long resourceExpiredTime) {
            this.resourceExpiredTime = resourceExpiredTime;
            return this;
        }
        public Long getResourceExpiredTime() {
            return this.resourceExpiredTime;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeInstancesResponseBodyInstances setResourceSpec(DescribeInstancesResponseBodyInstancesResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeInstancesResponseBodyInstances setStorage(DescribeInstancesResponseBodyInstancesStorage storage) {
            this.storage = storage;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesStorage getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstances setTags(java.util.List<DescribeInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstances setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeInstancesResponseBodyInstances setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeInstancesResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
