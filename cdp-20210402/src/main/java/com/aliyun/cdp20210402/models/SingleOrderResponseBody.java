// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SingleOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public SingleOrderResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SingleOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleOrderResponseBody self = new SingleOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleOrderResponseBody setData(SingleOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SingleOrderResponseBodyData getData() {
        return this.data;
    }

    public SingleOrderResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SingleOrderResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SingleOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SingleOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SingleOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SingleOrderResponseBodyDataEcsGroupList extends TeaModel {
        @NameInMap("CpuCount")
        public Integer cpuCount;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("SystemDiskCapacity")
        public Integer systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        public Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        public String systemDiskType;

        public static SingleOrderResponseBodyDataEcsGroupList build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyDataEcsGroupList self = new SingleOrderResponseBodyDataEcsGroupList();
            return TeaModel.build(map, self);
        }

        public SingleOrderResponseBodyDataEcsGroupList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public SingleOrderResponseBodyDataEcsGroupList setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public SingleOrderResponseBodyDataEcsGroupList setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public SingleOrderResponseBodyDataEcsGroupList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public SingleOrderResponseBodyDataEcsGroupList setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public SingleOrderResponseBodyDataEcsGroupList setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public SingleOrderResponseBodyDataEcsGroupList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SingleOrderResponseBodyDataEcsGroupList setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public SingleOrderResponseBodyDataEcsGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public SingleOrderResponseBodyDataEcsGroupList setSystemDiskCapacity(Integer systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public Integer getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public SingleOrderResponseBodyDataEcsGroupList setSystemDiskCount(Integer systemDiskCount) {
            this.systemDiskCount = systemDiskCount;
            return this;
        }
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        public SingleOrderResponseBodyDataEcsGroupList setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

    }

    public static class SingleOrderResponseBodyData extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterSize")
        public Integer clusterSize;

        @NameInMap("ClusterStatus")
        public Integer clusterStatus;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EcsGroupList")
        public java.util.List<SingleOrderResponseBodyDataEcsGroupList> ecsGroupList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("StorageSize")
        public Integer storageSize;

        public static SingleOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyData self = new SingleOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SingleOrderResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SingleOrderResponseBodyData setClusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            return this;
        }
        public Integer getClusterSize() {
            return this.clusterSize;
        }

        public SingleOrderResponseBodyData setClusterStatus(Integer clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public Integer getClusterStatus() {
            return this.clusterStatus;
        }

        public SingleOrderResponseBodyData setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public SingleOrderResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SingleOrderResponseBodyData setEcsGroupList(java.util.List<SingleOrderResponseBodyDataEcsGroupList> ecsGroupList) {
            this.ecsGroupList = ecsGroupList;
            return this;
        }
        public java.util.List<SingleOrderResponseBodyDataEcsGroupList> getEcsGroupList() {
            return this.ecsGroupList;
        }

        public SingleOrderResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SingleOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public SingleOrderResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public SingleOrderResponseBodyData setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public SingleOrderResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

}
