// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AckNodePool extends TeaModel {
    @NameInMap("NodePoolId")
    public String nodePoolId;

    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    public static AckNodePool build(java.util.Map<String, ?> map) throws Exception {
        AckNodePool self = new AckNodePool();
        return TeaModel.build(map, self);
    }

    public AckNodePool setNodePoolId(String nodePoolId) {
        this.nodePoolId = nodePoolId;
        return this;
    }
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public AckNodePool setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static class Labels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Labels build(java.util.Map<String, ?> map) throws Exception {
            Labels self = new Labels();
            return TeaModel.build(map, self);
        }

        public Labels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Labels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Taints extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Taints build(java.util.Map<String, ?> map) throws Exception {
            Taints self = new Taints();
            return TeaModel.build(map, self);
        }

        public Taints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public Taints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Taints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NodeSelector extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<Labels> labels;

        @NameInMap("Taints")
        public java.util.List<Taints> taints;

        public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
            NodeSelector self = new NodeSelector();
            return TeaModel.build(map, self);
        }

        public NodeSelector setLabels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public NodeSelector setTaints(java.util.List<Taints> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taints> getTaints() {
            return this.taints;
        }

    }

}
