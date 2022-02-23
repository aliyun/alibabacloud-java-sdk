// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class SingleOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public SingleOrderResponseBodyData data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

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

    public SingleOrderResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SingleOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public static class SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList extends TeaModel {
        @NameInMap("BrokerNumber")
        public Integer brokerNumber;

        @NameInMap("CuNumPerBroker")
        public Integer cuNumPerBroker;

        @NameInMap("StorageSizePerBroker")
        public Integer storageSizePerBroker;

        public static SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList self = new SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList();
            return TeaModel.build(map, self);
        }

        public SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList setBrokerNumber(Integer brokerNumber) {
            this.brokerNumber = brokerNumber;
            return this;
        }
        public Integer getBrokerNumber() {
            return this.brokerNumber;
        }

        public SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList setCuNumPerBroker(Integer cuNumPerBroker) {
            this.cuNumPerBroker = cuNumPerBroker;
            return this;
        }
        public Integer getCuNumPerBroker() {
            return this.cuNumPerBroker;
        }

        public SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList setStorageSizePerBroker(Integer storageSizePerBroker) {
            this.storageSizePerBroker = storageSizePerBroker;
            return this;
        }
        public Integer getStorageSizePerBroker() {
            return this.storageSizePerBroker;
        }

    }

    public static class SingleOrderResponseBodyDataCspResourceConfig extends TeaModel {
        @NameInMap("BrokerConfigList")
        public java.util.List<SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList> brokerConfigList;

        @NameInMap("MultiAvailableZonePermission")
        public Boolean multiAvailableZonePermission;

        public static SingleOrderResponseBodyDataCspResourceConfig build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyDataCspResourceConfig self = new SingleOrderResponseBodyDataCspResourceConfig();
            return TeaModel.build(map, self);
        }

        public SingleOrderResponseBodyDataCspResourceConfig setBrokerConfigList(java.util.List<SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList> brokerConfigList) {
            this.brokerConfigList = brokerConfigList;
            return this;
        }
        public java.util.List<SingleOrderResponseBodyDataCspResourceConfigBrokerConfigList> getBrokerConfigList() {
            return this.brokerConfigList;
        }

        public SingleOrderResponseBodyDataCspResourceConfig setMultiAvailableZonePermission(Boolean multiAvailableZonePermission) {
            this.multiAvailableZonePermission = multiAvailableZonePermission;
            return this;
        }
        public Boolean getMultiAvailableZonePermission() {
            return this.multiAvailableZonePermission;
        }

    }

    public static class SingleOrderResponseBodyDataEcsGroupList extends TeaModel {
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

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("SysDiskType")
        public String sysDiskType;

        public static SingleOrderResponseBodyDataEcsGroupList build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyDataEcsGroupList self = new SingleOrderResponseBodyDataEcsGroupList();
            return TeaModel.build(map, self);
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

        public SingleOrderResponseBodyDataEcsGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public SingleOrderResponseBodyDataEcsGroupList setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public SingleOrderResponseBodyDataEcsGroupList setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

    }

    public static class SingleOrderResponseBodyData extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterSize")
        public Integer clusterSize;

        @NameInMap("ClusterStatus")
        public Integer clusterStatus;

        @NameInMap("CspResourceConfig")
        public SingleOrderResponseBodyDataCspResourceConfig cspResourceConfig;

        @NameInMap("CuNum")
        public Integer cuNum;

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

        @NameInMap("SpecVersion")
        public String specVersion;

        @NameInMap("StorageSize")
        public Integer storageSize;

        public static SingleOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SingleOrderResponseBodyData self = new SingleOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SingleOrderResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
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

        public SingleOrderResponseBodyData setCspResourceConfig(SingleOrderResponseBodyDataCspResourceConfig cspResourceConfig) {
            this.cspResourceConfig = cspResourceConfig;
            return this;
        }
        public SingleOrderResponseBodyDataCspResourceConfig getCspResourceConfig() {
            return this.cspResourceConfig;
        }

        public SingleOrderResponseBodyData setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
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

        public SingleOrderResponseBodyData setSpecVersion(String specVersion) {
            this.specVersion = specVersion;
            return this;
        }
        public String getSpecVersion() {
            return this.specVersion;
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
