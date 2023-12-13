// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The monitoring data of the elastic container instance.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeContainerGroupMetricResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerGroupMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupMetricResponseBody self = new DescribeContainerGroupMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupMetricResponseBody setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public DescribeContainerGroupMetricResponseBody setRecords(java.util.List<DescribeContainerGroupMetricResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeContainerGroupMetricResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeContainerGroupMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsCPU extends TeaModel {
        /**
         * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>The average load in the last 10 seconds.</p>
         */
        @NameInMap("Load")
        public Long load;

        /**
         * <p>The cumulative usage of vCPUs.</p>
         */
        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        /**
         * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
         */
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        public static DescribeContainerGroupMetricResponseBodyRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsCPU self = new DescribeContainerGroupMetricResponseBodyRecordsCPU();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainersCPU extends TeaModel {
        /**
         * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>The average load in the last 10 seconds.</p>
         */
        @NameInMap("Load")
        public Long load;

        /**
         * <p>The cumulative usage of vCPUs.</p>
         */
        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        /**
         * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
         */
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        public static DescribeContainerGroupMetricResponseBodyRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsContainersCPU self = new DescribeContainerGroupMetricResponseBodyRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainersMemory extends TeaModel {
        /**
         * <p>The size of the available memory. Unit: bytes.</p>
         */
        @NameInMap("AvailableBytes")
        public Long availableBytes;

        /**
         * <p>The size of the cache. Unit: bytes.</p>
         */
        @NameInMap("Cache")
        public Long cache;

        /**
         * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
         */
        @NameInMap("Rss")
        public Long rss;

        /**
         * <p>The size of the used memory. Unit: bytes.</p>
         */
        @NameInMap("UsageBytes")
        public Long usageBytes;

        /**
         * <p>The usage of the working set. Unit: bytes.</p>
         */
        @NameInMap("WorkingSet")
        public Long workingSet;

        public static DescribeContainerGroupMetricResponseBodyRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsContainersMemory self = new DescribeContainerGroupMetricResponseBodyRecordsContainersMemory();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainers extends TeaModel {
        /**
         * <p>The vCPU monitoring data of the container.</p>
         */
        @NameInMap("CPU")
        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU CPU;

        /**
         * <p>The memory monitoring data of the container.</p>
         */
        @NameInMap("Memory")
        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory memory;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeContainerGroupMetricResponseBodyRecordsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsContainers self = new DescribeContainerGroupMetricResponseBodyRecordsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainers setCPU(DescribeContainerGroupMetricResponseBodyRecordsContainersCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU getCPU() {
            return this.CPU;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainers setMemory(DescribeContainerGroupMetricResponseBodyRecordsContainersMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsDisk extends TeaModel {
        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The amount of data that was read from the disk. Unit: bytes.</p>
         */
        @NameInMap("ReadBytes")
        public Long readBytes;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("ReadIO")
        public Long readIO;

        /**
         * <p>The amount of data that was written to the disk. Unit: bytes.</p>
         */
        @NameInMap("WriteBytes")
        public Long writeBytes;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("WriteIO")
        public Long writeIO;

        public static DescribeContainerGroupMetricResponseBodyRecordsDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsDisk self = new DescribeContainerGroupMetricResponseBodyRecordsDisk();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsDisk setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsDisk setReadIO(Long readIO) {
            this.readIO = readIO;
            return this;
        }
        public Long getReadIO() {
            return this.readIO;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsDisk setWriteBytes(Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsDisk setWriteIO(Long writeIO) {
            this.writeIO = writeIO;
            return this;
        }
        public Long getWriteIO() {
            return this.writeIO;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsFilesystem extends TeaModel {
        /**
         * <p>The size of the available space.</p>
         */
        @NameInMap("Available")
        public Long available;

        /**
         * <p>The total file system space.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The type of the partition. Valid values:</p>
         * <br>
         * <p>*   System</p>
         * <p>*   Volume</p>
         * <p>*   Other</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The name of the partition.</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <p>The size of used space.</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static DescribeContainerGroupMetricResponseBodyRecordsFilesystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsFilesystem self = new DescribeContainerGroupMetricResponseBodyRecordsFilesystem();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsFilesystem setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsFilesystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsFilesystem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsFilesystem setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsFilesystem setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsMemory extends TeaModel {
        /**
         * <p>The size of the available memory. Unit: bytes.</p>
         */
        @NameInMap("AvailableBytes")
        public Long availableBytes;

        /**
         * <p>The size of the cache. Unit: bytes.</p>
         */
        @NameInMap("Cache")
        public Long cache;

        /**
         * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
         */
        @NameInMap("Rss")
        public Long rss;

        /**
         * <p>The size of the used memory. Unit: bytes.</p>
         */
        @NameInMap("UsageBytes")
        public Long usageBytes;

        /**
         * <p>The usage of the working set. Unit: bytes.</p>
         */
        @NameInMap("WorkingSet")
        public Long workingSet;

        public static DescribeContainerGroupMetricResponseBodyRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsMemory self = new DescribeContainerGroupMetricResponseBodyRecordsMemory();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsMemory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsMemory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsMemory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsMemory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsMemory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces extends TeaModel {
        /**
         * <p>The name of the NIC.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of bytes received by the NIC.</p>
         */
        @NameInMap("RxBytes")
        public Long rxBytes;

        /**
         * <p>The number of received packets dropped on the NIC.</p>
         */
        @NameInMap("RxDrops")
        public Long rxDrops;

        /**
         * <p>The number of received packet errors on the NIC.</p>
         */
        @NameInMap("RxErrors")
        public Long rxErrors;

        /**
         * <p>The number of packets received by the NIC.</p>
         */
        @NameInMap("RxPackets")
        public Long rxPackets;

        /**
         * <p>The number of bytes transmitted by the NIC.</p>
         */
        @NameInMap("TxBytes")
        public Long txBytes;

        /**
         * <p>The number of transmitted packets dropped on the NIC.</p>
         */
        @NameInMap("TxDrops")
        public Long txDrops;

        /**
         * <p>The number of transmitted packet errors on the NIC.</p>
         */
        @NameInMap("TxErrors")
        public Long txErrors;

        /**
         * <p>The number of packets transmitted by the NIC.</p>
         */
        @NameInMap("TxPackets")
        public Long txPackets;

        public static DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces self = new DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxDrops(Long rxDrops) {
            this.rxDrops = rxDrops;
            return this;
        }
        public Long getRxDrops() {
            return this.rxDrops;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxPackets(Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }
        public Long getRxPackets() {
            return this.rxPackets;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxDrops(Long txDrops) {
            this.txDrops = txDrops;
            return this;
        }
        public Long getTxDrops() {
            return this.txDrops;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxPackets(Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }
        public Long getTxPackets() {
            return this.txPackets;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsNetwork extends TeaModel {
        /**
         * <p>The monitoring data of network interface controllers (NICs).</p>
         */
        @NameInMap("Interfaces")
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces> interfaces;

        public static DescribeContainerGroupMetricResponseBodyRecordsNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsNetwork self = new DescribeContainerGroupMetricResponseBodyRecordsNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetwork setInterfaces(java.util.List<DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces> getInterfaces() {
            return this.interfaces;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecords extends TeaModel {
        /**
         * <p>The monitoring data of vCPUs.</p>
         */
        @NameInMap("CPU")
        public DescribeContainerGroupMetricResponseBodyRecordsCPU CPU;

        /**
         * <p>The monitoring data of containers.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> containers;

        /**
         * <p>The monitoring data of disks.</p>
         */
        @NameInMap("Disk")
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsDisk> disk;

        /**
         * <p>The monitoring data of file system partitions.</p>
         */
        @NameInMap("Filesystem")
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsFilesystem> filesystem;

        /**
         * <p>The monitoring data of the memory.</p>
         */
        @NameInMap("Memory")
        public DescribeContainerGroupMetricResponseBodyRecordsMemory memory;

        /**
         * <p>The monitoring data of the network.</p>
         */
        @NameInMap("Network")
        public DescribeContainerGroupMetricResponseBodyRecordsNetwork network;

        /**
         * <p>The time when the monitoring data entry was collected. The time follows the RFC 3339 format.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeContainerGroupMetricResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecords self = new DescribeContainerGroupMetricResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecords setCPU(DescribeContainerGroupMetricResponseBodyRecordsCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsCPU getCPU() {
            return this.CPU;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setContainers(java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> getContainers() {
            return this.containers;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setDisk(java.util.List<DescribeContainerGroupMetricResponseBodyRecordsDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsDisk> getDisk() {
            return this.disk;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setFilesystem(java.util.List<DescribeContainerGroupMetricResponseBodyRecordsFilesystem> filesystem) {
            this.filesystem = filesystem;
            return this;
        }
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsFilesystem> getFilesystem() {
            return this.filesystem;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setMemory(DescribeContainerGroupMetricResponseBodyRecordsMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsMemory getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setNetwork(DescribeContainerGroupMetricResponseBodyRecordsNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsNetwork getNetwork() {
            return this.network;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
