// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterQueueInfoResponseBody extends TeaModel {
    @NameInMap("Queues")
    public GetClusterQueueInfoResponseBodyQueues queues;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterQueueInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterQueueInfoResponseBody self = new GetClusterQueueInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterQueueInfoResponseBody setQueues(GetClusterQueueInfoResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public GetClusterQueueInfoResponseBodyQueues getQueues() {
        return this.queues;
    }

    public GetClusterQueueInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterQueueInfoResponseBodyQueuesQueue extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ExternalInfo")
        public String externalInfo;

        @NameInMap("MaxGpu")
        public Integer maxGpu;

        @NameInMap("MaxMem")
        public Integer maxMem;

        @NameInMap("MaxVCore")
        public Integer maxVCore;

        @NameInMap("MinGpu")
        public Integer minGpu;

        @NameInMap("MinMem")
        public Integer minMem;

        @NameInMap("MinVCore")
        public Integer minVCore;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("UsedGpu")
        public Integer usedGpu;

        @NameInMap("UsedMem")
        public Integer usedMem;

        @NameInMap("UsedVCore")
        public Integer usedVCore;

        public static GetClusterQueueInfoResponseBodyQueuesQueue build(java.util.Map<String, ?> map) throws Exception {
            GetClusterQueueInfoResponseBodyQueuesQueue self = new GetClusterQueueInfoResponseBodyQueuesQueue();
            return TeaModel.build(map, self);
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setExternalInfo(String externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public String getExternalInfo() {
            return this.externalInfo;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMaxGpu(Integer maxGpu) {
            this.maxGpu = maxGpu;
            return this;
        }
        public Integer getMaxGpu() {
            return this.maxGpu;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMaxMem(Integer maxMem) {
            this.maxMem = maxMem;
            return this;
        }
        public Integer getMaxMem() {
            return this.maxMem;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMaxVCore(Integer maxVCore) {
            this.maxVCore = maxVCore;
            return this;
        }
        public Integer getMaxVCore() {
            return this.maxVCore;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMinGpu(Integer minGpu) {
            this.minGpu = minGpu;
            return this;
        }
        public Integer getMinGpu() {
            return this.minGpu;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMinMem(Integer minMem) {
            this.minMem = minMem;
            return this;
        }
        public Integer getMinMem() {
            return this.minMem;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setMinVCore(Integer minVCore) {
            this.minVCore = minVCore;
            return this;
        }
        public Integer getMinVCore() {
            return this.minVCore;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setUsedGpu(Integer usedGpu) {
            this.usedGpu = usedGpu;
            return this;
        }
        public Integer getUsedGpu() {
            return this.usedGpu;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setUsedMem(Integer usedMem) {
            this.usedMem = usedMem;
            return this;
        }
        public Integer getUsedMem() {
            return this.usedMem;
        }

        public GetClusterQueueInfoResponseBodyQueuesQueue setUsedVCore(Integer usedVCore) {
            this.usedVCore = usedVCore;
            return this;
        }
        public Integer getUsedVCore() {
            return this.usedVCore;
        }

    }

    public static class GetClusterQueueInfoResponseBodyQueues extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<GetClusterQueueInfoResponseBodyQueuesQueue> queue;

        public static GetClusterQueueInfoResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            GetClusterQueueInfoResponseBodyQueues self = new GetClusterQueueInfoResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public GetClusterQueueInfoResponseBodyQueues setQueue(java.util.List<GetClusterQueueInfoResponseBodyQueuesQueue> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<GetClusterQueueInfoResponseBodyQueuesQueue> getQueue() {
            return this.queue;
        }

    }

}
