// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeSelector extends TeaModel {
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("NodeGroupTypes")
    public java.util.List<String> nodeGroupTypes;

    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    @NameInMap("NodeSelectType")
    public String nodeSelectType;

    public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
        NodeSelector self = new NodeSelector();
        return TeaModel.build(map, self);
    }

    public NodeSelector setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public NodeSelector setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeSelector setNodeGroupTypes(java.util.List<String> nodeGroupTypes) {
        this.nodeGroupTypes = nodeGroupTypes;
        return this;
    }
    public java.util.List<String> getNodeGroupTypes() {
        return this.nodeGroupTypes;
    }

    public NodeSelector setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public NodeSelector setNodeSelectType(String nodeSelectType) {
        this.nodeSelectType = nodeSelectType;
        return this;
    }
    public String getNodeSelectType() {
        return this.nodeSelectType;
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

}
