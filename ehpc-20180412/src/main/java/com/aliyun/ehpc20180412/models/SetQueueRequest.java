// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetQueueRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Node")
    public java.util.List<SetQueueRequestNode> node;

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
