// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeSelector extends TeaModel {
    /**
     * <p>节点组ID。当NodeSelectType取值NodeGroup时，该参数生效。</p>
     */
    @NameInMap("NodeGroupId")
    @Deprecated
    public String nodeGroupId;

    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <p>节点组名称。当NodeSelectType取值NodeGroup，且参数NodeGroupId为空时生效，该参数生效。</p>
     */
    @NameInMap("NodeGroupName")
    @Deprecated
    public String nodeGroupName;

    @NameInMap("NodeGroupNames")
    public java.util.List<String> nodeGroupNames;

    /**
     * <p>节点组类型。当NodeSelectType取值NodeGroup，且参数NodeGroupId为空时生效。数组元数个数N取值范围：0~10。</p>
     */
    @NameInMap("NodeGroupTypes")
    public java.util.List<String> nodeGroupTypes;

    /**
     * <p>节点名称列表。当NodeSelectType取值Node时，该参数生效。</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>节点选择类型。取值范围：</p>
     * <p>- CLUSTER：集群。</p>
     * <p>- NODE_GROUP：节点组。</p>
     * <p>- NODE：节点。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public NodeSelector setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public NodeSelector setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeSelector setNodeGroupNames(java.util.List<String> nodeGroupNames) {
        this.nodeGroupNames = nodeGroupNames;
        return this;
    }
    public java.util.List<String> getNodeGroupNames() {
        return this.nodeGroupNames;
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

}
