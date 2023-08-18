// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectBindQueueResponseBody extends TeaModel {
    @NameInMap("Queues")
    public ListProjectBindQueueResponseBodyQueues queues;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectBindQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBindQueueResponseBody self = new ListProjectBindQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectBindQueueResponseBody setQueues(ListProjectBindQueueResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public ListProjectBindQueueResponseBodyQueues getQueues() {
        return this.queues;
    }

    public ListProjectBindQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectBindQueueResponseBodyQueuesQueue extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("QueueName")
        public String queueName;

        public static ListProjectBindQueueResponseBodyQueuesQueue build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBindQueueResponseBodyQueuesQueue self = new ListProjectBindQueueResponseBodyQueuesQueue();
            return TeaModel.build(map, self);
        }

        public ListProjectBindQueueResponseBodyQueuesQueue setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListProjectBindQueueResponseBodyQueuesQueue setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class ListProjectBindQueueResponseBodyQueues extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<ListProjectBindQueueResponseBodyQueuesQueue> queue;

        public static ListProjectBindQueueResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBindQueueResponseBodyQueues self = new ListProjectBindQueueResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListProjectBindQueueResponseBodyQueues setQueue(java.util.List<ListProjectBindQueueResponseBodyQueuesQueue> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<ListProjectBindQueueResponseBodyQueuesQueue> getQueue() {
            return this.queue;
        }

    }

}
