// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    @NameInMap("Records")
    @Validation(required = true)
    public java.util.List<DescribeContainerGroupMetricResponseRecords> records;

    public static DescribeContainerGroupMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupMetricResponse self = new DescribeContainerGroupMetricResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContainerGroupMetricResponseRecordsContainersCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        @Validation(required = true)
        public Long usageNanoCores;

        @NameInMap("UsageCoreNanoSeconds")
        @Validation(required = true)
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        @Validation(required = true)
        public Long load;

        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        public static DescribeContainerGroupMetricResponseRecordsContainersCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsContainersCPU self = new DescribeContainerGroupMetricResponseRecordsContainersCPU();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsContainersMemory extends TeaModel {
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

        public static DescribeContainerGroupMetricResponseRecordsContainersMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsContainersMemory self = new DescribeContainerGroupMetricResponseRecordsContainersMemory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CPU")
        @Validation(required = true)
        public DescribeContainerGroupMetricResponseRecordsContainersCPU CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public DescribeContainerGroupMetricResponseRecordsContainersMemory memory;

        public static DescribeContainerGroupMetricResponseRecordsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsContainers self = new DescribeContainerGroupMetricResponseRecordsContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsCPU extends TeaModel {
        @NameInMap("UsageNanoCores")
        @Validation(required = true)
        public Long usageNanoCores;

        @NameInMap("UsageCoreNanoSeconds")
        @Validation(required = true)
        public Long usageCoreNanoSeconds;

        @NameInMap("Load")
        @Validation(required = true)
        public Long load;

        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        public static DescribeContainerGroupMetricResponseRecordsCPU build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsCPU self = new DescribeContainerGroupMetricResponseRecordsCPU();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsMemory extends TeaModel {
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

        public static DescribeContainerGroupMetricResponseRecordsMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsMemory self = new DescribeContainerGroupMetricResponseRecordsMemory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsNetworkInterfaces extends TeaModel {
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

        public static DescribeContainerGroupMetricResponseRecordsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsNetworkInterfaces self = new DescribeContainerGroupMetricResponseRecordsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecordsNetwork extends TeaModel {
        @NameInMap("Interfaces")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupMetricResponseRecordsNetworkInterfaces> interfaces;

        public static DescribeContainerGroupMetricResponseRecordsNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecordsNetwork self = new DescribeContainerGroupMetricResponseRecordsNetwork();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupMetricResponseRecords extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Containers")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupMetricResponseRecordsContainers> containers;

        @NameInMap("CPU")
        @Validation(required = true)
        public DescribeContainerGroupMetricResponseRecordsCPU CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public DescribeContainerGroupMetricResponseRecordsMemory memory;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeContainerGroupMetricResponseRecordsNetwork network;

        public static DescribeContainerGroupMetricResponseRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupMetricResponseRecords self = new DescribeContainerGroupMetricResponseRecords();
            return TeaModel.build(map, self);
        }

    }

}
