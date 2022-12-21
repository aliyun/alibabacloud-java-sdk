// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentRequest extends TeaModel {
    // The node configurations after modification.
    @NameInMap("NodeContent")
    public String nodeContent;

    // The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.
    @NameInMap("NodeId")
    public String nodeId;

    // The ID of the tenant.
    // 
    // > To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the ["View information about the current tenant"](~~181330~~) section of the Manage DMS tenants topic.
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentRequest self = new UpdateTaskContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentRequest setNodeContent(String nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }
    public String getNodeContent() {
        return this.nodeContent;
    }

    public UpdateTaskContentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskContentRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
