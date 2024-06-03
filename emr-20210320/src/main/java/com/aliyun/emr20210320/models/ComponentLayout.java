// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ComponentLayout extends TeaModel {
    /**
     * <p>应用名称。</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>组件名称。</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>节点选择器。</p>
     */
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
        /**
         * <p>节点结束编号，包含结束编号。</p>
         */
        @NameInMap("NodeEndIndex")
        public Integer nodeEndIndex;

        /**
         * <p>节点组ID。</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>机器组下标编号。</p>
         */
        @NameInMap("NodeGroupIndex")
        public Integer nodeGroupIndex;

        /**
         * <p>机器组名。</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>SelectType = NODE_GROUP 且 nodeGroupId 不存在时使用</p>
         */
        @NameInMap("NodeGroupTypes")
        public java.util.List<String> nodeGroupTypes;

        /**
         * <p>节点名称列表。</p>
         */
        @NameInMap("NodeNames")
        public java.util.List<String> nodeNames;

        /**
         * <p>节点选择类型。</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeSelectType")
        public String nodeSelectType;

        /**
         * <p>节点开始编号，包含开始编号。</p>
         */
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
