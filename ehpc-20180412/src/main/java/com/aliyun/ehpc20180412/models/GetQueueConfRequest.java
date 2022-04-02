// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetQueueConfRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Queues")
    public java.util.List<GetQueueConfRequestQueues> queues;

    public static GetQueueConfRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueConfRequest self = new GetQueueConfRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueConfRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetQueueConfRequest setQueues(java.util.List<GetQueueConfRequestQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<GetQueueConfRequestQueues> getQueues() {
        return this.queues;
    }

    public static class GetQueueConfRequestQueues extends TeaModel {
        @NameInMap("QueueName")
        public String queueName;

        public static GetQueueConfRequestQueues build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConfRequestQueues self = new GetQueueConfRequestQueues();
            return TeaModel.build(map, self);
        }

        public GetQueueConfRequestQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

}
