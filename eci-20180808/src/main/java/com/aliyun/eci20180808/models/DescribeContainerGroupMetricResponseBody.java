// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-bp1dqpye03ke5s6p****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The monitoring data of the elastic container instance.</p>
     */
    @NameInMap("Records")
    public java.util.List<Records> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D81A4A13-6DCC-4579-AC62-90A6C3EC7BBC</p>
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

    public DescribeContainerGroupMetricResponseBody setRecords(java.util.List<Records> records) {
        this.records = records;
        return this;
    }
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    public DescribeContainerGroupMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CPU extends TeaModel {
        /**
         * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>The average load in the last 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Load")
        public Long load;

        /**
         * <p>The cumulative usage of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>70769883</p>
         */
        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        /**
         * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        public static CPU build(java.util.Map<String, ?> map) throws Exception {
            CPU self = new CPU();
            return TeaModel.build(map, self);
        }

        public CPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public CPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public CPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public CPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class ContainersCPU extends TeaModel {
        /**
         * <p>The upper limit of vCPU usage. The calculation formula for this parameter: The number of vCPUs × 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>The average load in the last 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Load")
        public Long load;

        /**
         * <p>The cumulative usage of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>40876694</p>
         */
        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        /**
         * <p>The vCPU usage in the sampling window. Unit for the sampling window: nanoseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        public static ContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            ContainersCPU self = new ContainersCPU();
            return TeaModel.build(map, self);
        }

        public ContainersCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public ContainersCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

        public ContainersCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public ContainersCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

    }

    public static class Memory extends TeaModel {
        /**
         * <p>The size of the available memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4285091840</p>
         */
        @NameInMap("AvailableBytes")
        public Long availableBytes;

        /**
         * <p>The size of the cache. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("Cache")
        public Long cache;

        /**
         * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("Rss")
        public Long rss;

        /**
         * <p>The size of the used memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("UsageBytes")
        public Long usageBytes;

        /**
         * <p>The usage of the working set. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("WorkingSet")
        public Long workingSet;

        public static Memory build(java.util.Map<String, ?> map) throws Exception {
            Memory self = new Memory();
            return TeaModel.build(map, self);
        }

        public Memory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public Memory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public Memory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public Memory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public Memory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class Containers extends TeaModel {
        /**
         * <p>The vCPU monitoring data of the container.</p>
         */
        @NameInMap("CPU")
        public ContainersCPU CPU;

        /**
         * <p>The memory monitoring data of the container.</p>
         */
        @NameInMap("Memory")
        public Memory memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>u1</p>
         */
        @NameInMap("Name")
        public String name;

        public static Containers build(java.util.Map<String, ?> map) throws Exception {
            Containers self = new Containers();
            return TeaModel.build(map, self);
        }

        public Containers setCPU(ContainersCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public ContainersCPU getCPU() {
            return this.CPU;
        }

        public Containers setMemory(Memory memory) {
            this.memory = memory;
            return this;
        }
        public Memory getMemory() {
            return this.memory;
        }

        public Containers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class Disk extends TeaModel {
        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The amount of data that was read from the disk. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>210714112</p>
         */
        @NameInMap("ReadBytes")
        public Long readBytes;

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ReadIO")
        public Long readIO;

        /**
         * <p>The amount of data that was written to the disk. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1375109120</p>
         */
        @NameInMap("WriteBytes")
        public Long writeBytes;

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("WriteIO")
        public Long writeIO;

        public static Disk build(java.util.Map<String, ?> map) throws Exception {
            Disk self = new Disk();
            return TeaModel.build(map, self);
        }

        public Disk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public Disk setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public Disk setReadIO(Long readIO) {
            this.readIO = readIO;
            return this;
        }
        public Long getReadIO() {
            return this.readIO;
        }

        public Disk setWriteBytes(Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        public Disk setWriteIO(Long writeIO) {
            this.writeIO = writeIO;
            return this;
        }
        public Long getWriteIO() {
            return this.writeIO;
        }

    }

    public static class Filesystem extends TeaModel {
        /**
         * <p>The size of the available space.</p>
         * 
         * <strong>example:</strong>
         * <p>35319836672</p>
         */
        @NameInMap("Available")
        public Long available;

        /**
         * <p>The total file system space.</p>
         * 
         * <strong>example:</strong>
         * <p>41610981376</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The type of the partition. Valid values:</p>
         * <ul>
         * <li>System</li>
         * <li>Volume</li>
         * <li>Other</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The name of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/root</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <p>The size of used space.</p>
         * 
         * <strong>example:</strong>
         * <p>4368744448</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static Filesystem build(java.util.Map<String, ?> map) throws Exception {
            Filesystem self = new Filesystem();
            return TeaModel.build(map, self);
        }

        public Filesystem setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public Filesystem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public Filesystem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public Filesystem setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public Filesystem setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class RecordsMemory extends TeaModel {
        /**
         * <p>The size of the available memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4285091840</p>
         */
        @NameInMap("AvailableBytes")
        public Long availableBytes;

        /**
         * <p>The size of the cache. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("Cache")
        public Long cache;

        /**
         * <p>The size of the resident memory set, which indicates the size of the physical memory that is actually used. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("Rss")
        public Long rss;

        /**
         * <p>The size of the used memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("UsageBytes")
        public Long usageBytes;

        /**
         * <p>The usage of the working set. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9289728</p>
         */
        @NameInMap("WorkingSet")
        public Long workingSet;

        public static RecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            RecordsMemory self = new RecordsMemory();
            return TeaModel.build(map, self);
        }

        public RecordsMemory setAvailableBytes(Long availableBytes) {
            this.availableBytes = availableBytes;
            return this;
        }
        public Long getAvailableBytes() {
            return this.availableBytes;
        }

        public RecordsMemory setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public RecordsMemory setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public RecordsMemory setUsageBytes(Long usageBytes) {
            this.usageBytes = usageBytes;
            return this;
        }
        public Long getUsageBytes() {
            return this.usageBytes;
        }

        public RecordsMemory setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

    }

    public static class Interfaces extends TeaModel {
        /**
         * <p>The name of the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of bytes received by the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>505001954</p>
         */
        @NameInMap("RxBytes")
        public Long rxBytes;

        /**
         * <p>The number of received packets dropped on the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RxDrops")
        public Long rxDrops;

        /**
         * <p>The number of received packet errors on the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RxErrors")
        public Long rxErrors;

        /**
         * <p>The number of packets received by the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>4800583</p>
         */
        @NameInMap("RxPackets")
        public Long rxPackets;

        /**
         * <p>The number of bytes transmitted by the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>1381805699</p>
         */
        @NameInMap("TxBytes")
        public Long txBytes;

        /**
         * <p>The number of transmitted packets dropped on the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TxDrops")
        public Long txDrops;

        /**
         * <p>The number of transmitted packet errors on the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TxErrors")
        public Long txErrors;

        /**
         * <p>The number of packets transmitted by the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>5158427</p>
         */
        @NameInMap("TxPackets")
        public Long txPackets;

        public static Interfaces build(java.util.Map<String, ?> map) throws Exception {
            Interfaces self = new Interfaces();
            return TeaModel.build(map, self);
        }

        public Interfaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Interfaces setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

        public Interfaces setRxDrops(Long rxDrops) {
            this.rxDrops = rxDrops;
            return this;
        }
        public Long getRxDrops() {
            return this.rxDrops;
        }

        public Interfaces setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public Interfaces setRxPackets(Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }
        public Long getRxPackets() {
            return this.rxPackets;
        }

        public Interfaces setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public Interfaces setTxDrops(Long txDrops) {
            this.txDrops = txDrops;
            return this;
        }
        public Long getTxDrops() {
            return this.txDrops;
        }

        public Interfaces setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public Interfaces setTxPackets(Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }
        public Long getTxPackets() {
            return this.txPackets;
        }

    }

    public static class Network extends TeaModel {
        /**
         * <p>The monitoring data of network interface controllers (NICs).</p>
         */
        @NameInMap("Interfaces")
        public java.util.List<Interfaces> interfaces;

        public static Network build(java.util.Map<String, ?> map) throws Exception {
            Network self = new Network();
            return TeaModel.build(map, self);
        }

        public Network setInterfaces(java.util.List<Interfaces> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public java.util.List<Interfaces> getInterfaces() {
            return this.interfaces;
        }

    }

    public static class Records extends TeaModel {
        /**
         * <p>The monitoring data of vCPUs.</p>
         */
        @NameInMap("CPU")
        public CPU CPU;

        /**
         * <p>The monitoring data of containers.</p>
         */
        @NameInMap("Containers")
        public java.util.List<Containers> containers;

        /**
         * <p>The monitoring data of disks.</p>
         */
        @NameInMap("Disk")
        public java.util.List<Disk> disk;

        /**
         * <p>The monitoring data of file system partitions.</p>
         */
        @NameInMap("Filesystem")
        public java.util.List<Filesystem> filesystem;

        /**
         * <p>The monitoring data of the memory.</p>
         */
        @NameInMap("Memory")
        public RecordsMemory memory;

        /**
         * <p>The monitoring data of the network.</p>
         */
        @NameInMap("Network")
        public Network network;

        /**
         * <p>The time when the monitoring data entry was collected. The time follows the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-25T16:22:00.000+08:00</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static Records build(java.util.Map<String, ?> map) throws Exception {
            Records self = new Records();
            return TeaModel.build(map, self);
        }

        public Records setCPU(CPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public CPU getCPU() {
            return this.CPU;
        }

        public Records setContainers(java.util.List<Containers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<Containers> getContainers() {
            return this.containers;
        }

        public Records setDisk(java.util.List<Disk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<Disk> getDisk() {
            return this.disk;
        }

        public Records setFilesystem(java.util.List<Filesystem> filesystem) {
            this.filesystem = filesystem;
            return this;
        }
        public java.util.List<Filesystem> getFilesystem() {
            return this.filesystem;
        }

        public Records setMemory(RecordsMemory memory) {
            this.memory = memory;
            return this;
        }
        public RecordsMemory getMemory() {
            return this.memory;
        }

        public Records setNetwork(Network network) {
            this.network = network;
            return this;
        }
        public Network getNetwork() {
            return this.network;
        }

        public Records setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
