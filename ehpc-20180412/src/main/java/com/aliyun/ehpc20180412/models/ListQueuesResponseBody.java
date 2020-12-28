// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Queues")
    public java.util.List<ListQueuesResponseBodyQueues> queues;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueuesResponseBody setQueues(java.util.List<ListQueuesResponseBodyQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<ListQueuesResponseBodyQueues> getQueues() {
        return this.queues;
    }

    public static class ListQueuesResponseBodyQueues extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ComputeInstanceType")
        public String computeInstanceType;

        public static ListQueuesResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueues self = new ListQueuesResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQueuesResponseBodyQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueuesResponseBodyQueues setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListQueuesResponseBodyQueues setComputeInstanceType(String computeInstanceType) {
            this.computeInstanceType = computeInstanceType;
            return this;
        }
        public String getComputeInstanceType() {
            return this.computeInstanceType;
        }

    }

}
