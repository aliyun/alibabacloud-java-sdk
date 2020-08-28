// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorDatas")
    @Validation(required = true)
    public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatas> monitorDatas;

    public static DescribeMultiContainerGroupMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricResponse self = new DescribeMultiContainerGroupMetricResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersCPU extends TeaModel {
        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Load")
        @Validation(required = true)
        public Long load;

        @NameInMap("UsageCoreNanoSeconds")
        @Validation(required = true)
        public Long usageCoreNanoSeconds;

        @NameInMap("UsageNanoCores")
        @Validation(required = true)
        public Long usageNanoCores;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersCPU self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersMemory extends TeaModel {
        @NameInMap("AvailableBytes")
        @Validation(required = true)
        public Long availableBytes;

        @NameInMap("UsageBytes")
        @Validation(required = true)
        public Long usageBytes;

        @NameInMap("Cache")
        @Validation(required = true)
        public Long cache;

        @NameInMap("WorkingSet")
        @Validation(required = true)
        public Long workingSet;

        @NameInMap("Rss")
        @Validation(required = true)
        public Long rss;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersMemory self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersMemory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CPU")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersCPU CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainersMemory memory;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainers self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsCPU extends TeaModel {
        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Load")
        @Validation(required = true)
        public Long load;

        @NameInMap("UsageCoreNanoSeconds")
        @Validation(required = true)
        public Long usageCoreNanoSeconds;

        @NameInMap("UsageNanoCores")
        @Validation(required = true)
        public Long usageNanoCores;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsCPU self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsCPU();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsMemory extends TeaModel {
        @NameInMap("AvailableBytes")
        @Validation(required = true)
        public Long availableBytes;

        @NameInMap("UsageBytes")
        @Validation(required = true)
        public Long usageBytes;

        @NameInMap("Cache")
        @Validation(required = true)
        public Long cache;

        @NameInMap("WorkingSet")
        @Validation(required = true)
        public Long workingSet;

        @NameInMap("Rss")
        @Validation(required = true)
        public Long rss;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsMemory self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsMemory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetworkInterfaces extends TeaModel {
        @NameInMap("TxBytes")
        @Validation(required = true)
        public Long txBytes;

        @NameInMap("RxBytes")
        @Validation(required = true)
        public Long rxBytes;

        @NameInMap("TxErrors")
        @Validation(required = true)
        public Long txErrors;

        @NameInMap("RxErrors")
        @Validation(required = true)
        public Long rxErrors;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetworkInterfaces self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetwork extends TeaModel {
        @NameInMap("Interfaces")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetworkInterfaces> interfaces;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetwork self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetwork();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasRecords extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Containers")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsContainers> containers;

        @NameInMap("CPU")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsCPU CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsMemory memory;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasRecordsNetwork network;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasRecords self = new DescribeMultiContainerGroupMetricResponseMonitorDatasRecords();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsFsStats extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Usage")
        @Validation(required = true)
        public Long usage;

        @NameInMap("BaseUsage")
        @Validation(required = true)
        public Long baseUsage;

        @NameInMap("Available")
        @Validation(required = true)
        public Long available;

        @NameInMap("HasInodes")
        @Validation(required = true)
        public Boolean hasInodes;

        @NameInMap("Inodes")
        @Validation(required = true)
        public Long inodes;

        @NameInMap("InodesFree")
        @Validation(required = true)
        public Long inodesFree;

        @NameInMap("ReadsCompleted")
        @Validation(required = true)
        public Long readsCompleted;

        @NameInMap("ReadsMerged")
        @Validation(required = true)
        public Long readsMerged;

        @NameInMap("SectorsRead")
        @Validation(required = true)
        public Long sectorsRead;

        @NameInMap("ReadTime")
        @Validation(required = true)
        public Long readTime;

        @NameInMap("WritesCompleted")
        @Validation(required = true)
        public Long writesCompleted;

        @NameInMap("WritesMerged")
        @Validation(required = true)
        public Long writesMerged;

        @NameInMap("SectorsWritten")
        @Validation(required = true)
        public Long sectorsWritten;

        @NameInMap("WriteTime")
        @Validation(required = true)
        public Long writeTime;

        @NameInMap("IoInProgress")
        @Validation(required = true)
        public Long ioInProgress;

        @NameInMap("IoTime")
        @Validation(required = true)
        public Long ioTime;

        @NameInMap("WeightedIoTime")
        @Validation(required = true)
        public Long weightedIoTime;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsFsStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsFsStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsFsStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsAcceleratorStats extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Make")
        @Validation(required = true)
        public String make;

        @NameInMap("Model")
        @Validation(required = true)
        public String model;

        @NameInMap("MemoryTotal")
        @Validation(required = true)
        public Long memoryTotal;

        @NameInMap("MemoryUsed")
        @Validation(required = true)
        public Long memoryUsed;

        @NameInMap("DutyCycle")
        @Validation(required = true)
        public Long dutyCycle;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsAcceleratorStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsAcceleratorStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsAcceleratorStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("User")
        @Validation(required = true)
        public Long user;

        @NameInMap("System")
        @Validation(required = true)
        public Long system;

        @NameInMap("PerCpuUsages")
        @Validation(required = true)
        public java.util.List<Long> perCpuUsages;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS extends TeaModel {
        @NameInMap("Periods")
        @Validation(required = true)
        public Long periods;

        @NameInMap("ThrottledPeriods")
        @Validation(required = true)
        public Long throttledPeriods;

        @NameInMap("ThrottledTime")
        @Validation(required = true)
        public Long throttledTime;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStats extends TeaModel {
        @NameInMap("LoadAverage")
        @Validation(required = true)
        public Long loadAverage;

        @NameInMap("CpuUsage")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage cpuUsage;

        @NameInMap("CpuCFS")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS cpuCFS;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime extends TeaModel {
        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("Major")
        @Validation(required = true)
        public Long major;

        @NameInMap("Minor")
        @Validation(required = true)
        public Long minor;

        @NameInMap("Stats")
        @Validation(required = true)
        public String stats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStats extends TeaModel {
        @NameInMap("IoServiceBytes")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes> ioServiceBytes;

        @NameInMap("IoServiced")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced> ioServiced;

        @NameInMap("IoQueued")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued> ioQueued;

        @NameInMap("Sectors")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors> sectors;

        @NameInMap("IoServiceTime")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime> ioServiceTime;

        @NameInMap("IoWaitTime")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime> ioWaitTime;

        @NameInMap("IoMerged")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged> ioMerged;

        @NameInMap("IoTime")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime> ioTime;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData extends TeaModel {
        @NameInMap("PgFault")
        @Validation(required = true)
        public Long pgFault;

        @NameInMap("PgmajFault")
        @Validation(required = true)
        public Long pgmajFault;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData extends TeaModel {
        @NameInMap("PgFault")
        @Validation(required = true)
        public Long pgFault;

        @NameInMap("PgmajFault")
        @Validation(required = true)
        public Long pgmajFault;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStats extends TeaModel {
        @NameInMap("Usage")
        @Validation(required = true)
        public Long usage;

        @NameInMap("MaxUsage")
        @Validation(required = true)
        public Long maxUsage;

        @NameInMap("Cache")
        @Validation(required = true)
        public Long cache;

        @NameInMap("Rss")
        @Validation(required = true)
        public Long rss;

        @NameInMap("Swap")
        @Validation(required = true)
        public Long swap;

        @NameInMap("WorkingSet")
        @Validation(required = true)
        public Long workingSet;

        @NameInMap("FailCnt")
        @Validation(required = true)
        public Long failCnt;

        @NameInMap("ContainerData")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData containerData;

        @NameInMap("HierarchicalData")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData hierarchicalData;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RxBytes")
        @Validation(required = true)
        public Long rxBytes;

        @NameInMap("RxPackets")
        @Validation(required = true)
        public Long rxPackets;

        @NameInMap("RxErrors")
        @Validation(required = true)
        public Long rxErrors;

        @NameInMap("RxDropped")
        @Validation(required = true)
        public Long rxDropped;

        @NameInMap("TxBytes")
        @Validation(required = true)
        public Long txBytes;

        @NameInMap("TxPackets")
        @Validation(required = true)
        public Long txPackets;

        @NameInMap("TxDropped")
        @Validation(required = true)
        public Long txDropped;

        @NameInMap("TxErrors")
        @Validation(required = true)
        public Long txErrors;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp extends TeaModel {
        @NameInMap("Established")
        @Validation(required = true)
        public Long established;

        @NameInMap("SynSent")
        @Validation(required = true)
        public Long synSent;

        @NameInMap("SynRecv")
        @Validation(required = true)
        public Long synRecv;

        @NameInMap("FinWait1")
        @Validation(required = true)
        public Long finWait1;

        @NameInMap("FinWait2")
        @Validation(required = true)
        public Long finWait2;

        @NameInMap("TimeWait")
        @Validation(required = true)
        public Long timeWait;

        @NameInMap("Close")
        @Validation(required = true)
        public Long close;

        @NameInMap("CloseWait")
        @Validation(required = true)
        public Long closeWait;

        @NameInMap("LastAck")
        @Validation(required = true)
        public Long lastAck;

        @NameInMap("Listen")
        @Validation(required = true)
        public Long listen;

        @NameInMap("Closing")
        @Validation(required = true)
        public Long closing;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 extends TeaModel {
        @NameInMap("Established")
        @Validation(required = true)
        public Long established;

        @NameInMap("SynSent")
        @Validation(required = true)
        public Long synSent;

        @NameInMap("SynRecv")
        @Validation(required = true)
        public Long synRecv;

        @NameInMap("FinWait1")
        @Validation(required = true)
        public Long finWait1;

        @NameInMap("FinWait2")
        @Validation(required = true)
        public Long finWait2;

        @NameInMap("TimeWait")
        @Validation(required = true)
        public Long timeWait;

        @NameInMap("Close")
        @Validation(required = true)
        public Long close;

        @NameInMap("CloseWait")
        @Validation(required = true)
        public Long closeWait;

        @NameInMap("LastAck")
        @Validation(required = true)
        public Long lastAck;

        @NameInMap("Listen")
        @Validation(required = true)
        public Long listen;

        @NameInMap("Closing")
        @Validation(required = true)
        public Long closing;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp extends TeaModel {
        @NameInMap("Listen")
        @Validation(required = true)
        public Long listen;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Long dropped;

        @NameInMap("RxQueued")
        @Validation(required = true)
        public Long rxQueued;

        @NameInMap("TxQueued")
        @Validation(required = true)
        public Long txQueued;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 extends TeaModel {
        @NameInMap("Listen")
        @Validation(required = true)
        public Long listen;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Long dropped;

        @NameInMap("RxQueued")
        @Validation(required = true)
        public Long rxQueued;

        @NameInMap("TxQueued")
        @Validation(required = true)
        public Long txQueued;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStats extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RxBytes")
        @Validation(required = true)
        public Long rxBytes;

        @NameInMap("RxPackets")
        @Validation(required = true)
        public Long rxPackets;

        @NameInMap("RxErrors")
        @Validation(required = true)
        public Long rxErrors;

        @NameInMap("RxDropped")
        @Validation(required = true)
        public Long rxDropped;

        @NameInMap("TxBytes")
        @Validation(required = true)
        public Long txBytes;

        @NameInMap("TxPackets")
        @Validation(required = true)
        public Long txPackets;

        @NameInMap("TxDropped")
        @Validation(required = true)
        public Long txDropped;

        @NameInMap("TxErrors")
        @Validation(required = true)
        public Long txErrors;

        @NameInMap("InterfaceStats")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats> interfaceStats;

        @NameInMap("Tcp")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp tcp;

        @NameInMap("Tcp6")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 tcp6;

        @NameInMap("Udp")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp udp;

        @NameInMap("Udp6")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 udp6;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsTaskStats extends TeaModel {
        @NameInMap("NrSleeping")
        @Validation(required = true)
        public Long nrSleeping;

        @NameInMap("NrRunning")
        @Validation(required = true)
        public Long nrRunning;

        @NameInMap("NrStopped")
        @Validation(required = true)
        public Long nrStopped;

        @NameInMap("NrUninterruptible")
        @Validation(required = true)
        public Long nrUninterruptible;

        @NameInMap("NrIoWait")
        @Validation(required = true)
        public Long nrIoWait;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsTaskStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsTaskStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsTaskStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStats extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("FsStats")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsFsStats> fsStats;

        @NameInMap("AcceleratorStats")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsAcceleratorStats> acceleratorStats;

        @NameInMap("CpuStats")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsCpuStats cpuStats;

        @NameInMap("DiskIoStats")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsDiskIoStats diskIoStats;

        @NameInMap("MemoryStats")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsMemoryStats memoryStats;

        @NameInMap("NetworkStats")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsNetworkStats networkStats;

        @NameInMap("TaskStats")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStatsTaskStats taskStats;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStats self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStats();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerCpu extends TeaModel {
        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("MaxLimit")
        @Validation(required = true)
        public Long maxLimit;

        @NameInMap("Mask")
        @Validation(required = true)
        public String mask;

        @NameInMap("Quota")
        @Validation(required = true)
        public Long quota;

        @NameInMap("Period")
        @Validation(required = true)
        public Long period;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerCpu self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerCpu();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerMemory extends TeaModel {
        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Reservation")
        @Validation(required = true)
        public Long reservation;

        @NameInMap("SwapLimit")
        @Validation(required = true)
        public Long swapLimit;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerMemory self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerMemory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpec extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("HasCpu")
        @Validation(required = true)
        public Boolean hasCpu;

        @NameInMap("HasMemory")
        @Validation(required = true)
        public Boolean hasMemory;

        @NameInMap("HasNetwork")
        @Validation(required = true)
        public Boolean hasNetwork;

        @NameInMap("HasFilesystem")
        @Validation(required = true)
        public Boolean hasFilesystem;

        @NameInMap("HasDiskIo")
        @Validation(required = true)
        public Boolean hasDiskIo;

        @NameInMap("HasCustomMetrics")
        @Validation(required = true)
        public Boolean hasCustomMetrics;

        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("Labels")
        @Validation(required = true)
        public String labels;

        @NameInMap("Envs")
        @Validation(required = true)
        public String envs;

        @NameInMap("ContainerCpu")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerCpu containerCpu;

        @NameInMap("ContainerMemory")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpecContainerMemory containerMemory;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpec self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpec();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfos extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("Labels")
        @Validation(required = true)
        public String labels;

        @NameInMap("ContainerStats")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerStats> containerStats;

        @NameInMap("ContainerSpec")
        @Validation(required = true)
        public DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfosContainerSpec containerSpec;

        @NameInMap("Aliases")
        @Validation(required = true)
        public java.util.List<String> aliases;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfos self = new DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseMonitorDatas extends TeaModel {
        @NameInMap("ContainerGroupId")
        @Validation(required = true)
        public String containerGroupId;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasRecords> records;

        @NameInMap("ContainerInfos")
        @Validation(required = true)
        public java.util.List<DescribeMultiContainerGroupMetricResponseMonitorDatasContainerInfos> containerInfos;

        public static DescribeMultiContainerGroupMetricResponseMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseMonitorDatas self = new DescribeMultiContainerGroupMetricResponseMonitorDatas();
            return TeaModel.build(map, self);
        }

    }

}
