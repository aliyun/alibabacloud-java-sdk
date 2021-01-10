// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorDatas")
    public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> monitorDatas;

    public static DescribeMultiContainerGroupMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricResponseBody self = new DescribeMultiContainerGroupMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiContainerGroupMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMultiContainerGroupMetricResponseBody setMonitorDatas(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> monitorDatas) {
        this.monitorDatas = monitorDatas;
        return this;
    }
    public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatas> getMonitorDatas() {
        return this.monitorDatas;
    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetworkInterfaces setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork extends TeaModel {
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

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        public Long load;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        public Long usageNanoCores;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("UsageCoreNanoSeconds")
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        public Long load;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setUsageNanoCores(Long usageNanoCores) {
            this.usageNanoCores = usageNanoCores;
            return this;
        }
        public Long getUsageNanoCores() {
            return this.usageNanoCores;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setUsageCoreNanoSeconds(Long usageCoreNanoSeconds) {
            this.usageCoreNanoSeconds = usageCoreNanoSeconds;
            return this;
        }
        public Long getUsageCoreNanoSeconds() {
            return this.usageCoreNanoSeconds;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU setLoad(Long load) {
            this.load = load;
            return this;
        }
        public Long getLoad() {
            return this.load;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory extends TeaModel {
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

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers extends TeaModel {
        @NameInMap("CPU")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersCPU CPU;

        @NameInMap("Memory")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainersMemory memory;

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

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords extends TeaModel {
        @NameInMap("Network")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork network;

        @NameInMap("CPU")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU CPU;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Memory")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory memory;

        @NameInMap("Containers")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> containers;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setNetwork(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsNetwork getNetwork() {
            return this.network;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setCPU(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsCPU getCPU() {
            return this.CPU;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setMemory(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsMemory getMemory() {
            return this.memory;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords setContainers(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecordsContainers> getContainers() {
            return this.containers;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("SwapLimit")
        public Long swapLimit;

        @NameInMap("Reservation")
        public Long reservation;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory setSwapLimit(Long swapLimit) {
            this.swapLimit = swapLimit;
            return this;
        }
        public Long getSwapLimit() {
            return this.swapLimit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory setReservation(Long reservation) {
            this.reservation = reservation;
            return this;
        }
        public Long getReservation() {
            return this.reservation;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu extends TeaModel {
        @NameInMap("Quota")
        public Long quota;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("MaxLimit")
        public Long maxLimit;

        @NameInMap("Period")
        public Long period;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu setMaxLimit(Long maxLimit) {
            this.maxLimit = maxLimit;
            return this;
        }
        public Long getMaxLimit() {
            return this.maxLimit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Image")
        public String image;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("HasCustomMetrics")
        public Boolean hasCustomMetrics;

        @NameInMap("HasCpu")
        public Boolean hasCpu;

        @NameInMap("Envs")
        public String envs;

        @NameInMap("HasDiskIo")
        public Boolean hasDiskIo;

        @NameInMap("HasFilesystem")
        public Boolean hasFilesystem;

        @NameInMap("HasNetwork")
        public Boolean hasNetwork;

        @NameInMap("ContainerMemory")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory containerMemory;

        @NameInMap("HasMemory")
        public Boolean hasMemory;

        @NameInMap("ContainerCpu")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu containerCpu;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasCustomMetrics(Boolean hasCustomMetrics) {
            this.hasCustomMetrics = hasCustomMetrics;
            return this;
        }
        public Boolean getHasCustomMetrics() {
            return this.hasCustomMetrics;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasCpu(Boolean hasCpu) {
            this.hasCpu = hasCpu;
            return this;
        }
        public Boolean getHasCpu() {
            return this.hasCpu;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasDiskIo(Boolean hasDiskIo) {
            this.hasDiskIo = hasDiskIo;
            return this;
        }
        public Boolean getHasDiskIo() {
            return this.hasDiskIo;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasFilesystem(Boolean hasFilesystem) {
            this.hasFilesystem = hasFilesystem;
            return this;
        }
        public Boolean getHasFilesystem() {
            return this.hasFilesystem;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasNetwork(Boolean hasNetwork) {
            this.hasNetwork = hasNetwork;
            return this;
        }
        public Boolean getHasNetwork() {
            return this.hasNetwork;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setContainerMemory(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory containerMemory) {
            this.containerMemory = containerMemory;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerMemory getContainerMemory() {
            return this.containerMemory;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setHasMemory(Boolean hasMemory) {
            this.hasMemory = hasMemory;
            return this;
        }
        public Boolean getHasMemory() {
            return this.hasMemory;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec setContainerCpu(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu containerCpu) {
            this.containerCpu = containerCpu;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpecContainerCpu getContainerCpu() {
            return this.containerCpu;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp extends TeaModel {
        @NameInMap("CloseWait")
        public Long closeWait;

        @NameInMap("FinWait2")
        public Long finWait2;

        @NameInMap("LastAck")
        public Long lastAck;

        @NameInMap("Closing")
        public Long closing;

        @NameInMap("Listen")
        public Long listen;

        @NameInMap("TimeWait")
        public Long timeWait;

        @NameInMap("Established")
        public Long established;

        @NameInMap("FinWait1")
        public Long finWait1;

        @NameInMap("Close")
        public Long close;

        @NameInMap("SynRecv")
        public Long synRecv;

        @NameInMap("SynSent")
        public Long synSent;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setCloseWait(Long closeWait) {
            this.closeWait = closeWait;
            return this;
        }
        public Long getCloseWait() {
            return this.closeWait;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setFinWait2(Long finWait2) {
            this.finWait2 = finWait2;
            return this;
        }
        public Long getFinWait2() {
            return this.finWait2;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setLastAck(Long lastAck) {
            this.lastAck = lastAck;
            return this;
        }
        public Long getLastAck() {
            return this.lastAck;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setClosing(Long closing) {
            this.closing = closing;
            return this;
        }
        public Long getClosing() {
            return this.closing;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setListen(Long listen) {
            this.listen = listen;
            return this;
        }
        public Long getListen() {
            return this.listen;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setTimeWait(Long timeWait) {
            this.timeWait = timeWait;
            return this;
        }
        public Long getTimeWait() {
            return this.timeWait;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setEstablished(Long established) {
            this.established = established;
            return this;
        }
        public Long getEstablished() {
            return this.established;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setFinWait1(Long finWait1) {
            this.finWait1 = finWait1;
            return this;
        }
        public Long getFinWait1() {
            return this.finWait1;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setClose(Long close) {
            this.close = close;
            return this;
        }
        public Long getClose() {
            return this.close;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setSynRecv(Long synRecv) {
            this.synRecv = synRecv;
            return this;
        }
        public Long getSynRecv() {
            return this.synRecv;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp setSynSent(Long synSent) {
            this.synSent = synSent;
            return this;
        }
        public Long getSynSent() {
            return this.synSent;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats extends TeaModel {
        @NameInMap("RxErrors")
        public Long rxErrors;

        @NameInMap("RxDropped")
        public Long rxDropped;

        @NameInMap("TxDropped")
        public Long txDropped;

        @NameInMap("TxBytes")
        public Long txBytes;

        @NameInMap("RxPackets")
        public Long rxPackets;

        @NameInMap("TxErrors")
        public Long txErrors;

        @NameInMap("TxPackets")
        public Long txPackets;

        @NameInMap("RxBytes")
        public Long rxBytes;

        @NameInMap("Name")
        public String name;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setRxDropped(Long rxDropped) {
            this.rxDropped = rxDropped;
            return this;
        }
        public Long getRxDropped() {
            return this.rxDropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setTxDropped(Long txDropped) {
            this.txDropped = txDropped;
            return this;
        }
        public Long getTxDropped() {
            return this.txDropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setRxPackets(Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }
        public Long getRxPackets() {
            return this.rxPackets;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setTxPackets(Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }
        public Long getTxPackets() {
            return this.txPackets;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 extends TeaModel {
        @NameInMap("CloseWait")
        public Long closeWait;

        @NameInMap("FinWait2")
        public Long finWait2;

        @NameInMap("LastAck")
        public Long lastAck;

        @NameInMap("Closing")
        public Long closing;

        @NameInMap("Listen")
        public Long listen;

        @NameInMap("TimeWait")
        public Long timeWait;

        @NameInMap("Established")
        public Long established;

        @NameInMap("FinWait1")
        public Long finWait1;

        @NameInMap("Close")
        public Long close;

        @NameInMap("SynRecv")
        public Long synRecv;

        @NameInMap("SynSent")
        public Long synSent;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setCloseWait(Long closeWait) {
            this.closeWait = closeWait;
            return this;
        }
        public Long getCloseWait() {
            return this.closeWait;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setFinWait2(Long finWait2) {
            this.finWait2 = finWait2;
            return this;
        }
        public Long getFinWait2() {
            return this.finWait2;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setLastAck(Long lastAck) {
            this.lastAck = lastAck;
            return this;
        }
        public Long getLastAck() {
            return this.lastAck;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setClosing(Long closing) {
            this.closing = closing;
            return this;
        }
        public Long getClosing() {
            return this.closing;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setListen(Long listen) {
            this.listen = listen;
            return this;
        }
        public Long getListen() {
            return this.listen;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setTimeWait(Long timeWait) {
            this.timeWait = timeWait;
            return this;
        }
        public Long getTimeWait() {
            return this.timeWait;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setEstablished(Long established) {
            this.established = established;
            return this;
        }
        public Long getEstablished() {
            return this.established;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setFinWait1(Long finWait1) {
            this.finWait1 = finWait1;
            return this;
        }
        public Long getFinWait1() {
            return this.finWait1;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setClose(Long close) {
            this.close = close;
            return this;
        }
        public Long getClose() {
            return this.close;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setSynRecv(Long synRecv) {
            this.synRecv = synRecv;
            return this;
        }
        public Long getSynRecv() {
            return this.synRecv;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 setSynSent(Long synSent) {
            this.synSent = synSent;
            return this;
        }
        public Long getSynSent() {
            return this.synSent;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp extends TeaModel {
        @NameInMap("TxQueued")
        public Long txQueued;

        @NameInMap("Listen")
        public Long listen;

        @NameInMap("Dropped")
        public Long dropped;

        @NameInMap("RxQueued")
        public Long rxQueued;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp setTxQueued(Long txQueued) {
            this.txQueued = txQueued;
            return this;
        }
        public Long getTxQueued() {
            return this.txQueued;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp setListen(Long listen) {
            this.listen = listen;
            return this;
        }
        public Long getListen() {
            return this.listen;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp setDropped(Long dropped) {
            this.dropped = dropped;
            return this;
        }
        public Long getDropped() {
            return this.dropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp setRxQueued(Long rxQueued) {
            this.rxQueued = rxQueued;
            return this;
        }
        public Long getRxQueued() {
            return this.rxQueued;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 extends TeaModel {
        @NameInMap("TxQueued")
        public Long txQueued;

        @NameInMap("Listen")
        public Long listen;

        @NameInMap("Dropped")
        public Long dropped;

        @NameInMap("RxQueued")
        public Long rxQueued;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 setTxQueued(Long txQueued) {
            this.txQueued = txQueued;
            return this;
        }
        public Long getTxQueued() {
            return this.txQueued;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 setListen(Long listen) {
            this.listen = listen;
            return this;
        }
        public Long getListen() {
            return this.listen;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 setDropped(Long dropped) {
            this.dropped = dropped;
            return this;
        }
        public Long getDropped() {
            return this.dropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 setRxQueued(Long rxQueued) {
            this.rxQueued = rxQueued;
            return this;
        }
        public Long getRxQueued() {
            return this.rxQueued;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats extends TeaModel {
        @NameInMap("RxDropped")
        public Long rxDropped;

        @NameInMap("Tcp")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp tcp;

        @NameInMap("TxErrors")
        public Long txErrors;

        @NameInMap("RxErrors")
        public Long rxErrors;

        @NameInMap("InterfaceStats")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats> interfaceStats;

        @NameInMap("Tcp6")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 tcp6;

        @NameInMap("TxDropped")
        public Long txDropped;

        @NameInMap("Udp")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp udp;

        @NameInMap("TxBytes")
        public Long txBytes;

        @NameInMap("Udp6")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 udp6;

        @NameInMap("RxPackets")
        public Long rxPackets;

        @NameInMap("Name")
        public String name;

        @NameInMap("RxBytes")
        public Long rxBytes;

        @NameInMap("TxPackets")
        public Long txPackets;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setRxDropped(Long rxDropped) {
            this.rxDropped = rxDropped;
            return this;
        }
        public Long getRxDropped() {
            return this.rxDropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTcp(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp tcp) {
            this.tcp = tcp;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp getTcp() {
            return this.tcp;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTxErrors(Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }
        public Long getTxErrors() {
            return this.txErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setRxErrors(Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }
        public Long getRxErrors() {
            return this.rxErrors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setInterfaceStats(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats> interfaceStats) {
            this.interfaceStats = interfaceStats;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsInterfaceStats> getInterfaceStats() {
            return this.interfaceStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTcp6(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 tcp6) {
            this.tcp6 = tcp6;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsTcp6 getTcp6() {
            return this.tcp6;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTxDropped(Long txDropped) {
            this.txDropped = txDropped;
            return this;
        }
        public Long getTxDropped() {
            return this.txDropped;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setUdp(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp udp) {
            this.udp = udp;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp getUdp() {
            return this.udp;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTxBytes(Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }
        public Long getTxBytes() {
            return this.txBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setUdp6(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 udp6) {
            this.udp6 = udp6;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStatsUdp6 getUdp6() {
            return this.udp6;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setRxPackets(Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }
        public Long getRxPackets() {
            return this.rxPackets;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setRxBytes(Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }
        public Long getRxBytes() {
            return this.rxBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats setTxPackets(Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }
        public Long getTxPackets() {
            return this.txPackets;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ReadsMerged")
        public Long readsMerged;

        @NameInMap("HasInodes")
        public Boolean hasInodes;

        @NameInMap("ReadsCompleted")
        public Long readsCompleted;

        @NameInMap("WritesMerged")
        public Long writesMerged;

        @NameInMap("InodesFree")
        public Long inodesFree;

        @NameInMap("Available")
        public Long available;

        @NameInMap("Usage")
        public Long usage;

        @NameInMap("Inodes")
        public Long inodes;

        @NameInMap("BaseUsage")
        public Long baseUsage;

        @NameInMap("SectorsRead")
        public Long sectorsRead;

        @NameInMap("WriteTime")
        public Long writeTime;

        @NameInMap("SectorsWritten")
        public Long sectorsWritten;

        @NameInMap("ReadTime")
        public Long readTime;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Device")
        public String device;

        @NameInMap("WritesCompleted")
        public Long writesCompleted;

        @NameInMap("IoTime")
        public Long ioTime;

        @NameInMap("WeightedIoTime")
        public Long weightedIoTime;

        @NameInMap("IoInProgress")
        public Long ioInProgress;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setReadsMerged(Long readsMerged) {
            this.readsMerged = readsMerged;
            return this;
        }
        public Long getReadsMerged() {
            return this.readsMerged;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setHasInodes(Boolean hasInodes) {
            this.hasInodes = hasInodes;
            return this;
        }
        public Boolean getHasInodes() {
            return this.hasInodes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setReadsCompleted(Long readsCompleted) {
            this.readsCompleted = readsCompleted;
            return this;
        }
        public Long getReadsCompleted() {
            return this.readsCompleted;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setWritesMerged(Long writesMerged) {
            this.writesMerged = writesMerged;
            return this;
        }
        public Long getWritesMerged() {
            return this.writesMerged;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setInodesFree(Long inodesFree) {
            this.inodesFree = inodesFree;
            return this;
        }
        public Long getInodesFree() {
            return this.inodesFree;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setInodes(Long inodes) {
            this.inodes = inodes;
            return this;
        }
        public Long getInodes() {
            return this.inodes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setBaseUsage(Long baseUsage) {
            this.baseUsage = baseUsage;
            return this;
        }
        public Long getBaseUsage() {
            return this.baseUsage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setSectorsRead(Long sectorsRead) {
            this.sectorsRead = sectorsRead;
            return this;
        }
        public Long getSectorsRead() {
            return this.sectorsRead;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setWriteTime(Long writeTime) {
            this.writeTime = writeTime;
            return this;
        }
        public Long getWriteTime() {
            return this.writeTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setSectorsWritten(Long sectorsWritten) {
            this.sectorsWritten = sectorsWritten;
            return this;
        }
        public Long getSectorsWritten() {
            return this.sectorsWritten;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setReadTime(Long readTime) {
            this.readTime = readTime;
            return this;
        }
        public Long getReadTime() {
            return this.readTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setWritesCompleted(Long writesCompleted) {
            this.writesCompleted = writesCompleted;
            return this;
        }
        public Long getWritesCompleted() {
            return this.writesCompleted;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setIoTime(Long ioTime) {
            this.ioTime = ioTime;
            return this;
        }
        public Long getIoTime() {
            return this.ioTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setWeightedIoTime(Long weightedIoTime) {
            this.weightedIoTime = weightedIoTime;
            return this;
        }
        public Long getWeightedIoTime() {
            return this.weightedIoTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats setIoInProgress(Long ioInProgress) {
            this.ioInProgress = ioInProgress;
            return this;
        }
        public Long getIoInProgress() {
            return this.ioInProgress;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Temperature")
        public Long temperature;

        @NameInMap("PowerUsage")
        public Long powerUsage;

        @NameInMap("MemoryTotal")
        public Long memoryTotal;

        @NameInMap("Make")
        public String make;

        @NameInMap("DutyCycle")
        public Long dutyCycle;

        @NameInMap("MemoryUsed")
        public Long memoryUsed;

        @NameInMap("Id")
        public String id;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setTemperature(Long temperature) {
            this.temperature = temperature;
            return this;
        }
        public Long getTemperature() {
            return this.temperature;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setPowerUsage(Long powerUsage) {
            this.powerUsage = powerUsage;
            return this;
        }
        public Long getPowerUsage() {
            return this.powerUsage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setMemoryTotal(Long memoryTotal) {
            this.memoryTotal = memoryTotal;
            return this;
        }
        public Long getMemoryTotal() {
            return this.memoryTotal;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setMake(String make) {
            this.make = make;
            return this;
        }
        public String getMake() {
            return this.make;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setDutyCycle(Long dutyCycle) {
            this.dutyCycle = dutyCycle;
            return this;
        }
        public Long getDutyCycle() {
            return this.dutyCycle;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setMemoryUsed(Long memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public Long getMemoryUsed() {
            return this.memoryUsed;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage extends TeaModel {
        @NameInMap("User")
        public Long user;

        @NameInMap("PerCpuUsages")
        public java.util.List<Long> perCpuUsages;

        @NameInMap("Total")
        public Long total;

        @NameInMap("System")
        public Long system;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage setUser(Long user) {
            this.user = user;
            return this;
        }
        public Long getUser() {
            return this.user;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage setPerCpuUsages(java.util.List<Long> perCpuUsages) {
            this.perCpuUsages = perCpuUsages;
            return this;
        }
        public java.util.List<Long> getPerCpuUsages() {
            return this.perCpuUsages;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage setSystem(Long system) {
            this.system = system;
            return this;
        }
        public Long getSystem() {
            return this.system;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS extends TeaModel {
        @NameInMap("ThrottledTime")
        public Long throttledTime;

        @NameInMap("Periods")
        public Long periods;

        @NameInMap("ThrottledPeriods")
        public Long throttledPeriods;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS setThrottledTime(Long throttledTime) {
            this.throttledTime = throttledTime;
            return this;
        }
        public Long getThrottledTime() {
            return this.throttledTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS setPeriods(Long periods) {
            this.periods = periods;
            return this;
        }
        public Long getPeriods() {
            return this.periods;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS setThrottledPeriods(Long throttledPeriods) {
            this.throttledPeriods = throttledPeriods;
            return this;
        }
        public Long getThrottledPeriods() {
            return this.throttledPeriods;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats extends TeaModel {
        @NameInMap("CpuUsage")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage cpuUsage;

        @NameInMap("LoadAverage")
        public Long loadAverage;

        @NameInMap("CpuCFS")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS cpuCFS;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats setCpuUsage(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuUsage getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats setLoadAverage(Long loadAverage) {
            this.loadAverage = loadAverage;
            return this;
        }
        public Long getLoadAverage() {
            return this.loadAverage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats setCpuCFS(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS cpuCFS) {
            this.cpuCFS = cpuCFS;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStatsCpuCFS getCpuCFS() {
            return this.cpuCFS;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData extends TeaModel {
        @NameInMap("PgmajFault")
        public Long pgmajFault;

        @NameInMap("PgFault")
        public Long pgFault;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData setPgmajFault(Long pgmajFault) {
            this.pgmajFault = pgmajFault;
            return this;
        }
        public Long getPgmajFault() {
            return this.pgmajFault;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData setPgFault(Long pgFault) {
            this.pgFault = pgFault;
            return this;
        }
        public Long getPgFault() {
            return this.pgFault;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData extends TeaModel {
        @NameInMap("PgmajFault")
        public Long pgmajFault;

        @NameInMap("PgFault")
        public Long pgFault;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData setPgmajFault(Long pgmajFault) {
            this.pgmajFault = pgmajFault;
            return this;
        }
        public Long getPgmajFault() {
            return this.pgmajFault;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData setPgFault(Long pgFault) {
            this.pgFault = pgFault;
            return this;
        }
        public Long getPgFault() {
            return this.pgFault;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats extends TeaModel {
        @NameInMap("FailCnt")
        public Long failCnt;

        @NameInMap("MaxUsage")
        public Long maxUsage;

        @NameInMap("HierarchicalData")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData hierarchicalData;

        @NameInMap("Rss")
        public Long rss;

        @NameInMap("ContainerData")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData containerData;

        @NameInMap("WorkingSet")
        public Long workingSet;

        @NameInMap("Swap")
        public Long swap;

        @NameInMap("Cache")
        public Long cache;

        @NameInMap("Usage")
        public Long usage;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setFailCnt(Long failCnt) {
            this.failCnt = failCnt;
            return this;
        }
        public Long getFailCnt() {
            return this.failCnt;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setMaxUsage(Long maxUsage) {
            this.maxUsage = maxUsage;
            return this;
        }
        public Long getMaxUsage() {
            return this.maxUsage;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setHierarchicalData(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData hierarchicalData) {
            this.hierarchicalData = hierarchicalData;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsHierarchicalData getHierarchicalData() {
            return this.hierarchicalData;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setRss(Long rss) {
            this.rss = rss;
            return this;
        }
        public Long getRss() {
            return this.rss;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setContainerData(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData containerData) {
            this.containerData = containerData;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStatsContainerData getContainerData() {
            return this.containerData;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setWorkingSet(Long workingSet) {
            this.workingSet = workingSet;
            return this;
        }
        public Long getWorkingSet() {
            return this.workingSet;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setSwap(Long swap) {
            this.swap = swap;
            return this;
        }
        public Long getSwap() {
            return this.swap;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setCache(Long cache) {
            this.cache = cache;
            return this;
        }
        public Long getCache() {
            return this.cache;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats extends TeaModel {
        @NameInMap("NrUninterruptible")
        public Long nrUninterruptible;

        @NameInMap("NrRunning")
        public Long nrRunning;

        @NameInMap("NrSleeping")
        public Long nrSleeping;

        @NameInMap("NrIoWait")
        public Long nrIoWait;

        @NameInMap("NrStopped")
        public Long nrStopped;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats setNrUninterruptible(Long nrUninterruptible) {
            this.nrUninterruptible = nrUninterruptible;
            return this;
        }
        public Long getNrUninterruptible() {
            return this.nrUninterruptible;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats setNrRunning(Long nrRunning) {
            this.nrRunning = nrRunning;
            return this;
        }
        public Long getNrRunning() {
            return this.nrRunning;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats setNrSleeping(Long nrSleeping) {
            this.nrSleeping = nrSleeping;
            return this;
        }
        public Long getNrSleeping() {
            return this.nrSleeping;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats setNrIoWait(Long nrIoWait) {
            this.nrIoWait = nrIoWait;
            return this;
        }
        public Long getNrIoWait() {
            return this.nrIoWait;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats setNrStopped(Long nrStopped) {
            this.nrStopped = nrStopped;
            return this;
        }
        public Long getNrStopped() {
            return this.nrStopped;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime extends TeaModel {
        @NameInMap("Stats")
        public String stats;

        @NameInMap("Minor")
        public Long minor;

        @NameInMap("Major")
        public Long major;

        @NameInMap("Device")
        public String device;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime setStats(String stats) {
            this.stats = stats;
            return this;
        }
        public String getStats() {
            return this.stats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime setMinor(Long minor) {
            this.minor = minor;
            return this;
        }
        public Long getMinor() {
            return this.minor;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime setMajor(Long major) {
            this.major = major;
            return this;
        }
        public Long getMajor() {
            return this.major;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats extends TeaModel {
        @NameInMap("IoServiced")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced> ioServiced;

        @NameInMap("IoServiceTime")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime> ioServiceTime;

        @NameInMap("IoServiceBytes")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes> ioServiceBytes;

        @NameInMap("IoMerged")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged> ioMerged;

        @NameInMap("Sectors")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors> sectors;

        @NameInMap("IoQueued")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued> ioQueued;

        @NameInMap("IoTime")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime> ioTime;

        @NameInMap("IoWaitTime")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime> ioWaitTime;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoServiced(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced> ioServiced) {
            this.ioServiced = ioServiced;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiced> getIoServiced() {
            return this.ioServiced;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoServiceTime(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime> ioServiceTime) {
            this.ioServiceTime = ioServiceTime;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceTime> getIoServiceTime() {
            return this.ioServiceTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoServiceBytes(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes> ioServiceBytes) {
            this.ioServiceBytes = ioServiceBytes;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoServiceBytes> getIoServiceBytes() {
            return this.ioServiceBytes;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoMerged(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged> ioMerged) {
            this.ioMerged = ioMerged;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoMerged> getIoMerged() {
            return this.ioMerged;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setSectors(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors> sectors) {
            this.sectors = sectors;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsSectors> getSectors() {
            return this.sectors;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoQueued(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued> ioQueued) {
            this.ioQueued = ioQueued;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoQueued> getIoQueued() {
            return this.ioQueued;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoTime(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime> ioTime) {
            this.ioTime = ioTime;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoTime> getIoTime() {
            return this.ioTime;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats setIoWaitTime(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime> ioWaitTime) {
            this.ioWaitTime = ioWaitTime;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStatsIoWaitTime> getIoWaitTime() {
            return this.ioWaitTime;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats extends TeaModel {
        @NameInMap("NetworkStats")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats networkStats;

        @NameInMap("FsStats")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats> fsStats;

        @NameInMap("AcceleratorStats")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats> acceleratorStats;

        @NameInMap("CpuStats")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats cpuStats;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("MemoryStats")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats memoryStats;

        @NameInMap("TaskStats")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats taskStats;

        @NameInMap("DiskIoStats")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats diskIoStats;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setNetworkStats(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats networkStats) {
            this.networkStats = networkStats;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsNetworkStats getNetworkStats() {
            return this.networkStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setFsStats(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats> fsStats) {
            this.fsStats = fsStats;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsFsStats> getFsStats() {
            return this.fsStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setAcceleratorStats(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats> acceleratorStats) {
            this.acceleratorStats = acceleratorStats;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsAcceleratorStats> getAcceleratorStats() {
            return this.acceleratorStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setCpuStats(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats cpuStats) {
            this.cpuStats = cpuStats;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsCpuStats getCpuStats() {
            return this.cpuStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setMemoryStats(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats memoryStats) {
            this.memoryStats = memoryStats;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsMemoryStats getMemoryStats() {
            return this.memoryStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setTaskStats(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats taskStats) {
            this.taskStats = taskStats;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsTaskStats getTaskStats() {
            return this.taskStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats setDiskIoStats(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats diskIoStats) {
            this.diskIoStats = diskIoStats;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStatsDiskIoStats getDiskIoStats() {
            return this.diskIoStats;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos extends TeaModel {
        @NameInMap("Aliases")
        public java.util.List<String> aliases;

        @NameInMap("ContainerSpec")
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec containerSpec;

        @NameInMap("ContainerStats")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats> containerStats;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setAliases(java.util.List<String> aliases) {
            this.aliases = aliases;
            return this;
        }
        public java.util.List<String> getAliases() {
            return this.aliases;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setContainerSpec(DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec containerSpec) {
            this.containerSpec = containerSpec;
            return this;
        }
        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerSpec getContainerSpec() {
            return this.containerSpec;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setContainerStats(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats> containerStats) {
            this.containerStats = containerStats;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfosContainerStats> getContainerStats() {
            return this.containerStats;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeMultiContainerGroupMetricResponseBodyMonitorDatas extends TeaModel {
        @NameInMap("Records")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> records;

        @NameInMap("ContainerInfos")
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos> containerInfos;

        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        public static DescribeMultiContainerGroupMetricResponseBodyMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiContainerGroupMetricResponseBodyMonitorDatas self = new DescribeMultiContainerGroupMetricResponseBodyMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatas setRecords(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasRecords> getRecords() {
            return this.records;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatas setContainerInfos(java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos> containerInfos) {
            this.containerInfos = containerInfos;
            return this;
        }
        public java.util.List<DescribeMultiContainerGroupMetricResponseBodyMonitorDatasContainerInfos> getContainerInfos() {
            return this.containerInfos;
        }

        public DescribeMultiContainerGroupMetricResponseBodyMonitorDatas setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

    }

}
