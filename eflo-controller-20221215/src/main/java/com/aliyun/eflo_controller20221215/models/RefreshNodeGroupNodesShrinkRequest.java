// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RefreshNodeGroupNodesShrinkRequest extends TeaModel {
    /**
     * <p>The maximum disruptive action level allowed for the refresh operation. The system independently evaluates the action level required to refresh each drifted property of a node and performs the refresh within the specified action level constraint. If the action level required for a property exceeds the specified level, that property is skipped. Action levels in increasing order of disruption: Refresh &lt; Reboot &lt; Reimage.</p>
     * <ul>
     * <li>Refresh (default): refreshes the configuration in place without restarting or reimaging. Currently applicable only to the RamRoleName property.</li>
     * <li>Reboot (not currently supported): allows restarting the node for the configuration to take effect. Supported properties include system cloud disk type and all properties supported by Refresh.</li>
     * <li>Reimage (not currently supported): allows reimaging the node for the configuration to take effect. Supported properties include image ID and all properties supported by Reboot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Refresh</p>
     */
    @NameInMap("MaxDisruptiveAction")
    public String maxDisruptiveAction;

    /**
     * <p>The node group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3525</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The filter scope for node refresh. If not specified, all nodes in the node group are included. <warning>If the instance type is a hypernode, pass the TrayNode ID, not the HyperNodeId.</warning></p>
     */
    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    public static RefreshNodeGroupNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshNodeGroupNodesShrinkRequest self = new RefreshNodeGroupNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshNodeGroupNodesShrinkRequest setMaxDisruptiveAction(String maxDisruptiveAction) {
        this.maxDisruptiveAction = maxDisruptiveAction;
        return this;
    }
    public String getMaxDisruptiveAction() {
        return this.maxDisruptiveAction;
    }

    public RefreshNodeGroupNodesShrinkRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public RefreshNodeGroupNodesShrinkRequest setNodeIdsShrink(String nodeIdsShrink) {
        this.nodeIdsShrink = nodeIdsShrink;
        return this;
    }
    public String getNodeIdsShrink() {
        return this.nodeIdsShrink;
    }

}
