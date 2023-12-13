// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricResponseBody extends TeaModel {
    /**
     * <p>The monitoring data of the elastic container instances.</p>
     */
    @NameInMap("MonitorDatas")
    public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> monitorDatas;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultiContainerGroupMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricResponseBody self = new DescribeMultiContainerGroupMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiContainerGroupMetricResponseBody setMonitorDatas(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> monitorDatas) {
        this.monitorDatas = monitorDatas;
        return this;
    }
    public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> getMonitorDatas() {
        return this.monitorDatas;
    }

    public DescribeMultiContainerGroupMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers extends TeaModel {
        /**
         * <p>The vCPU monitoring data of the container.</p>
         */
        @NameInMap("CPU")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU CPU;

        /**
         * <p>The memory monitoring data of the container.</p>
         */
        @NameInMap("Memory")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory memory;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers setCPU(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU getCPU() {
            return this.CPU;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers setMemory(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory getMemory() {
            return this.memory;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk extends TeaModel {
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
        @NameInMap("ReadIo")
        public Long readIo;

        /**
         * <p>The amount of data that was written to the disk. Unit: bytes.</p>
         */
        @NameInMap("WriteBytes")
        public Long writeBytes;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("WriteIo")
        public Long writeIo;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk setReadIo(Long readIo) {
            this.readIo = readIo;
            return this;
        }
        public Long getReadIo() {
            return this.readIo;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk setWriteBytes(Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk setWriteIo(Long writeIo) {
            this.writeIo = writeIo;
            return this;
        }
        public Long getWriteIo() {
            return this.writeIo;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem extends TeaModel {
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
         * <p>The name of the partition.</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <p>The size of used space.</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces extends TeaModel {
        /**
         * <p>The name of the NIC.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The total number of bytes received.</p>
         */
        @NameInMap("RxBytes")
        public Long rxBytes;

        /**
         * <p>The number of packets that fail to be received.</p>
         */
        @NameInMap("RxDrops")
        public Long rxDrops;

        /**
         * <p>The number of receipt errors.</p>
         */
        @NameInMap("RxErrors")
        public Long rxErrors;

        /**
         * <p>The total number of packets received.</p>
         */
        @NameInMap("RxPackets")
        public Long rxPackets;

        /**
         * <p>The total number of bytes sent.</p>
         */
        @NameInMap("TxBytes")
        public Long txBytes;

        /**
         * <p>The number of packets that fail to arrive at their destination.</p>
         */
        @NameInMap("TxDrops")
        public Long txDrops;

        /**
         * <p>The total number of sending errors.</p>
         */
        @NameInMap("TxErrors")
        public Long txErrors;

        /**
         * <p>The total number of packets sent.</p>
         */
        @NameInMap("TxPackets")
        public Long txPackets;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxDrops(Long rxDrops) {
            this.rxDrops = rxDrops;
            return this;
        }
        public Long getRxDrops() {
            return this.rxDrops;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxPackets(Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }
        public Long getRxPackets() {
            return this.rxPackets;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxDrops(Long txDrops) {
            this.txDrops = txDrops;
            return this;
        }
        public Long getTxDrops() {
            return this.txDrops;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxPackets(Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }
        public Long getTxPackets() {
            return this.txPackets;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork extends TeaModel {
        /**
         * <p>The monitoring data of network interface controllers (NICs).</p>
         */
        @NameInMap("Interfaces")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces> interfaces;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork setInterfaces(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces> getInterfaces() {
            return this.interfaces;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords extends TeaModel {
        /**
         * <p>The monitoring data of vCPUs.</p>
         */
        @NameInMap("CPU")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU CPU;

        /**
         * <p>The monitoring data of containers.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> containers;

        /**
         * <p>The monitoring data of disks.</p>
         */
        @NameInMap("Disk")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk> disk;

        /**
         * <p>The monitoring data of file system partitions.</p>
         */
        @NameInMap("Filesystem")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem> filesystem;

        /**
         * <p>The monitoring data of the memory.</p>
         */
        @NameInMap("Memory")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory memory;

        /**
         * <p>The monitoring data of the network.</p>
         */
        @NameInMap("Network")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork network;

        /**
         * <p>The time when the entry of monitoring data was collected. The time follows the RFC 3339 format.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setCPU(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU getCPU() {
            return this.CPU;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setContainers(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> getContainers() {
            return this.containers;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setDisk(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsDisk> getDisk() {
            return this.disk;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setFilesystem(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem> filesystem) {
            this.filesystem = filesystem;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsFilesystem> getFilesystem() {
            return this.filesystem;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setMemory(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory getMemory() {
            return this.memory;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setNetwork(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork getNetwork() {
            return this.network;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatas extends TeaModel {
        /**
         * <p>The ID of the elastic container instance.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The details about monitoring data.</p>
         */
        @NameInMap("Records")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> records;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatas self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatas setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatas setRecords(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> getRecords() {
            return this.records;
        }

    }

}
