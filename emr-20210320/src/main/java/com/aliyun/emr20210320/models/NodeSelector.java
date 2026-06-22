// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeSelector extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use <code>NodeGroupIds</code> instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    @Deprecated
    public String nodeGroupId;

    /**
     * <p>The IDs of the node groups to select.</p>
     */
    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use <code>NodeGroupNames</code> instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>master-1</p>
     */
    @NameInMap("NodeGroupName")
    @Deprecated
    public String nodeGroupName;

    /**
     * <p>The names of the node groups to select.</p>
     */
    @NameInMap("NodeGroupNames")
    public java.util.List<String> nodeGroupNames;

    /**
     * <p>The types of node groups to select. This parameter applies only when <code>NodeSelectType</code> is set to <code>NODE_GROUP</code> and <code>NodeGroupIds</code> is not specified. The array can contain up to 10 elements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CORE&quot;,&quot;TASK&quot;]</p>
     */
    @NameInMap("NodeGroupTypes")
    public java.util.List<String> nodeGroupTypes;

    /**
     * <p>The names of the nodes to select. This parameter applies only when <code>NodeSelectType</code> is set to <code>NODE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;core1-1&quot;]</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>The node selection type. Valid values:</p>
     * <ul>
     * <li><p><code>CLUSTER</code>: Selects all nodes in the cluster.</p>
     * </li>
     * <li><p><code>NODE_GROUP</code>: Selects nodes by their node group.</p>
     * </li>
     * <li><p><code>NODE</code>: Selects specific nodes by name.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("NodeSelectType")
    public String nodeSelectType;

    public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
        NodeSelector self = new NodeSelector();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    @Deprecated
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
