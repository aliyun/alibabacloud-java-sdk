// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetQueueRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Node")
    public java.util.List<SetQueueRequestNode> node;

    /**
     * <p>The name of the destination queue.</p>
     * <br>
     * <p>You can call the [ListQueues](~~92176~~) operation to query the queue name.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    public static SetQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQueueRequest self = new SetQueueRequest();
        return TeaModel.build(map, self);
    }

    public SetQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetQueueRequest setNode(java.util.List<SetQueueRequestNode> node) {
        this.node = node;
        return this;
    }
    public java.util.List<SetQueueRequestNode> getNode() {
        return this.node;
    }

    public SetQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public static class SetQueueRequestNode extends TeaModel {
        /**
         * <p>The name of the compute node that you want to move. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>You can call the [ListNodes](~~87161~~) operation to query the names of the compute nodes.</p>
         */
        @NameInMap("Name")
        public String name;

        public static SetQueueRequestNode build(java.util.Map<String, ?> map) throws Exception {
            SetQueueRequestNode self = new SetQueueRequestNode();
            return TeaModel.build(map, self);
        }

        public SetQueueRequestNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
