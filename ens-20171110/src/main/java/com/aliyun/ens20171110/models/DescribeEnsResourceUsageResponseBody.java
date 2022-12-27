// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsResourceUsageResponseBody extends TeaModel {
    @NameInMap("EnsResourceUsage")
    public java.util.List<DescribeEnsResourceUsageResponseBodyEnsResourceUsage> ensResourceUsage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsResourceUsageResponseBody self = new DescribeEnsResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsResourceUsageResponseBody setEnsResourceUsage(java.util.List<DescribeEnsResourceUsageResponseBodyEnsResourceUsage> ensResourceUsage) {
        this.ensResourceUsage = ensResourceUsage;
        return this;
    }
    public java.util.List<DescribeEnsResourceUsageResponseBodyEnsResourceUsage> getEnsResourceUsage() {
        return this.ensResourceUsage;
    }

    public DescribeEnsResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsResourceUsageResponseBodyEnsResourceUsage extends TeaModel {
        @NameInMap("ComputeResourceCount")
        public Integer computeResourceCount;

        @NameInMap("CpuSum")
        public Long cpuSum;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("DownCount")
        public Integer downCount;

        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        @NameInMap("ExpiringCount")
        public Integer expiringCount;

        @NameInMap("GpuSum")
        public Long gpuSum;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("RunningCount")
        public Integer runningCount;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("StorageSum")
        public Long storageSum;

        public static DescribeEnsResourceUsageResponseBodyEnsResourceUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsResourceUsageResponseBodyEnsResourceUsage self = new DescribeEnsResourceUsageResponseBodyEnsResourceUsage();
            return TeaModel.build(map, self);
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setComputeResourceCount(Integer computeResourceCount) {
            this.computeResourceCount = computeResourceCount;
            return this;
        }
        public Integer getComputeResourceCount() {
            return this.computeResourceCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setCpuSum(Long cpuSum) {
            this.cpuSum = cpuSum;
            return this;
        }
        public Long getCpuSum() {
            return this.cpuSum;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setDownCount(Integer downCount) {
            this.downCount = downCount;
            return this;
        }
        public Integer getDownCount() {
            return this.downCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setExpiringCount(Integer expiringCount) {
            this.expiringCount = expiringCount;
            return this;
        }
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setGpuSum(Long gpuSum) {
            this.gpuSum = gpuSum;
            return this;
        }
        public Long getGpuSum() {
            return this.gpuSum;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeEnsResourceUsageResponseBodyEnsResourceUsage setStorageSum(Long storageSum) {
            this.storageSum = storageSum;
            return this;
        }
        public Long getStorageSum() {
            return this.storageSum;
        }

    }

}
