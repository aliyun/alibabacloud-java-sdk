// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The resource usage data.</p>
     */
    @NameInMap("EnsResourceUsage")
    public java.util.List<DescribeEnsResourceUsageResponseBodyEnsResourceUsage> ensResourceUsage;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The number of edge services. This parameter is available only when you set the ServiceType parameter to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ComputeResourceCount")
        public Integer computeResourceCount;

        /**
         * <p>The CPU usage. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuSum")
        public Long cpuSum;

        /**
         * <p>The number of data disks.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DiskCount")
        public Integer diskCount;

        /**
         * <p>The number of stopped VMs.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("DownCount")
        public Integer downCount;

        /**
         * <p>The number of expired VM instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        /**
         * <p>The number of VM instances that are about to expire.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExpiringCount")
        public Integer expiringCount;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("GpuSum")
        public Long gpuSum;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>1: subscription instance.</li>
         * <li>2: edge service instance.</li>
         * <li>3: pay-as-you-go instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The total disk size.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
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
