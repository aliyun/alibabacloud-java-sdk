// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectBindQueueResourceResponseBody extends TeaModel {
    @NameInMap("Queues")
    public ListProjectBindQueueResourceResponseBodyQueues queues;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectBindQueueResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBindQueueResourceResponseBody self = new ListProjectBindQueueResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectBindQueueResourceResponseBody setQueues(ListProjectBindQueueResourceResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public ListProjectBindQueueResourceResponseBodyQueues getQueues() {
        return this.queues;
    }

    public ListProjectBindQueueResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectBindQueueResourceResponseBodyQueuesQueue extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

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

        public static ListProjectBindQueueResourceResponseBodyQueuesQueue build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBindQueueResourceResponseBodyQueuesQueue self = new ListProjectBindQueueResourceResponseBodyQueuesQueue();
            return TeaModel.build(map, self);
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMaxGpu(Integer maxGpu) {
            this.maxGpu = maxGpu;
            return this;
        }
        public Integer getMaxGpu() {
            return this.maxGpu;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMaxMem(Integer maxMem) {
            this.maxMem = maxMem;
            return this;
        }
        public Integer getMaxMem() {
            return this.maxMem;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMaxVCore(Integer maxVCore) {
            this.maxVCore = maxVCore;
            return this;
        }
        public Integer getMaxVCore() {
            return this.maxVCore;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMinGpu(Integer minGpu) {
            this.minGpu = minGpu;
            return this;
        }
        public Integer getMinGpu() {
            return this.minGpu;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMinMem(Integer minMem) {
            this.minMem = minMem;
            return this;
        }
        public Integer getMinMem() {
            return this.minMem;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setMinVCore(Integer minVCore) {
            this.minVCore = minVCore;
            return this;
        }
        public Integer getMinVCore() {
            return this.minVCore;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setUsedGpu(Integer usedGpu) {
            this.usedGpu = usedGpu;
            return this;
        }
        public Integer getUsedGpu() {
            return this.usedGpu;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setUsedMem(Integer usedMem) {
            this.usedMem = usedMem;
            return this;
        }
        public Integer getUsedMem() {
            return this.usedMem;
        }

        public ListProjectBindQueueResourceResponseBodyQueuesQueue setUsedVCore(Integer usedVCore) {
            this.usedVCore = usedVCore;
            return this;
        }
        public Integer getUsedVCore() {
            return this.usedVCore;
        }

    }

    public static class ListProjectBindQueueResourceResponseBodyQueues extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<ListProjectBindQueueResourceResponseBodyQueuesQueue> queue;

        public static ListProjectBindQueueResourceResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBindQueueResourceResponseBodyQueues self = new ListProjectBindQueueResourceResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListProjectBindQueueResourceResponseBodyQueues setQueue(java.util.List<ListProjectBindQueueResourceResponseBodyQueuesQueue> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<ListProjectBindQueueResourceResponseBodyQueuesQueue> getQueue() {
            return this.queue;
        }

    }

}
