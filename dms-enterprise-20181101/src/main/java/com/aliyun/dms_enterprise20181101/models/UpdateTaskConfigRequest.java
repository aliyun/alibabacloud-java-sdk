// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskConfigRequest extends TeaModel {
    /**
     * <p>The advanced configuration for the node. The value of this parameter must be a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;rerun&quot;:{ &quot;rerunEnable&quot;:true,  &quot;rerunCount&quot;:1,   &quot;rerunInterval&quot;:10 } }</p>
     */
    @NameInMap("NodeConfig")
    public String nodeConfig;

    /**
     * <p>The ID of the task node. You can call the <a href="https://help.aliyun.com/document_detail/424711.html">GetTaskInstanceRelation</a> operation to query the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
