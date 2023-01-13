// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskConfigRequest extends TeaModel {
    /**
     * <p>The advanced configuration for the node. The value of this parameter must be a JSON string.</p>
     */
    @NameInMap("NodeConfig")
    public String nodeConfig;

    /**
     * <p>The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskConfigRequest self = new UpdateTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskConfigRequest setNodeConfig(String nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public String getNodeConfig() {
        return this.nodeConfig;
    }

    public UpdateTaskConfigRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskConfigRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
