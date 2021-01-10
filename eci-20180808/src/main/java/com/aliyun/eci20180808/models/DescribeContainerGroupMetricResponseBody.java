// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    @NameInMap("Records")
    public java.util.List<DescribeContainerGroupMetricResponseBodyRecords> records;

    public static DescribeContainerGroupMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupMetricResponseBody self = new DescribeContainerGroupMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces extends TeaModel {
        @NameInMap("RxErrors")
        public Long rxErrors;

        @NameInMap("TxBytes")
        public Long txBytes;

        @NameInMap("Name")
        public String name;

        @NameInMap("TxErrors")
        public Long txErrors;

        @NameInMap("RxBytes")
        public Long rxBytes;

        public static DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces self = new DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsNetworkInterfaces setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsNetwork extends TeaModel {
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

    public static class DescribeContainerGroupMetricResponseBodyRecordsCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        public Long load;

        public static DescribeContainerGroupMetricResponseBodyRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsCPU self = new DescribeContainerGroupMetricResponseBodyRecordsCPU();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsMemory extends TeaModel {
        @NameInMap("Rss")
        public Long rss;

        @NameInMap("UsageBytes")
        public Long usageBytes;

        @NameInMap("WorkingSet")
        public Long workingSet;

        @NameInMap("AvailableBytes")
        public Long availableBytes;

        @NameInMap("Cache")
        public Long cache;

        public static DescribeContainerGroupMetricResponseBodyRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsMemory self = new DescribeContainerGroupMetricResponseBodyRecordsMemory();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainersCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        public Long load;

        public static DescribeContainerGroupMetricResponseBodyRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsContainersCPU self = new DescribeContainerGroupMetricResponseBodyRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainersMemory extends TeaModel {
        @NameInMap("Rss")
        public Long rss;

        @NameInMap("UsageBytes")
        public Long usageBytes;

        @NameInMap("WorkingSet")
        public Long workingSet;

        @NameInMap("AvailableBytes")
        public Long availableBytes;

        @NameInMap("Cache")
        public Long cache;

        public static DescribeContainerGroupMetricResponseBodyRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecordsContainersMemory self = new DescribeContainerGroupMetricResponseBodyRecordsContainersMemory();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeContainerGroupMetricResponseBodyRecordsContainers extends TeaModel {
        @NameInMap("CPU")
        public DescribeContainerGroupMetricResponseBodyRecordsContainersCPU CPU;

        @NameInMap("Memory")
        public DescribeContainerGroupMetricResponseBodyRecordsContainersMemory memory;

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

    public static class DescribeContainerGroupMetricResponseBodyRecords extends TeaModel {
        @NameInMap("Network")
        public DescribeContainerGroupMetricResponseBodyRecordsNetwork network;

        @NameInMap("CPU")
        public DescribeContainerGroupMetricResponseBodyRecordsCPU CPU;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Memory")
        public DescribeContainerGroupMetricResponseBodyRecordsMemory memory;

        @NameInMap("Containers")
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> containers;

        public static DescribeContainerGroupMetricResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseBodyRecords self = new DescribeContainerGroupMetricResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupMetricResponseBodyRecords setNetwork(DescribeContainerGroupMetricResponseBodyRecordsNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsNetwork getNetwork() {
            return this.network;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setCPU(DescribeContainerGroupMetricResponseBodyRecordsCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsCPU getCPU() {
            return this.CPU;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setMemory(DescribeContainerGroupMetricResponseBodyRecordsMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeContainerGroupMetricResponseBodyRecordsMemory getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupMetricResponseBodyRecords setContainers(java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeContainerGroupMetricResponseBodyRecordsContainers> getContainers() {
            return this.containers;
        }

    }

}
