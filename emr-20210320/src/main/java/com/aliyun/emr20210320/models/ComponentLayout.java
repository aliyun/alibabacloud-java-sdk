// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ComponentLayout extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    public static ComponentLayout build(java.util.Map<String, ?> map) throws Exception {
        ComponentLayout self = new ComponentLayout();
        return TeaModel.build(map, self);
    }

    public ComponentLayout setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ComponentLayout setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ComponentLayout setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static class NodeSelector extends TeaModel {
        @NameInMap("NodeEndIndex")
        public Integer nodeEndIndex;

        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        @NameInMap("NodeGroupIndex")
        public Integer nodeGroupIndex;

        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        @NameInMap("NodeGroupTypes")
        public java.util.List<String> nodeGroupTypes;

        @NameInMap("NodeNames")
        public java.util.List<String> nodeNames;

        @NameInMap("NodeSelectType")
        public String nodeSelectType;

        @NameInMap("NodeStartIndex")
        public Integer nodeStartIndex;

        public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
            NodeSelector self = new NodeSelector();
            return TeaModel.build(map, self);
        }

        public NodeSelector setNodeEndIndex(Integer nodeEndIndex) {
            this.nodeEndIndex = nodeEndIndex;
            return this;
        }
        public Integer getNodeEndIndex() {
            return this.nodeEndIndex;
        }

        public NodeSelector setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public NodeSelector setNodeGroupIndex(Integer nodeGroupIndex) {
            this.nodeGroupIndex = nodeGroupIndex;
            return this;
        }
        public Integer getNodeGroupIndex() {
            return this.nodeGroupIndex;
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

        public NodeSelector setNodeStartIndex(Integer nodeStartIndex) {
            this.nodeStartIndex = nodeStartIndex;
            return this;
        }
        public Integer getNodeStartIndex() {
            return this.nodeStartIndex;
        }

    }

}
