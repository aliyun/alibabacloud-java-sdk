// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class OperateWorkflowInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PAUSE</p>
     */
    @NameInMap("execType")
    public String execType;

    /**
     * <strong>example:</strong>
     * <p>wi-l9o479p8rrx****</p>
     */
    @NameInMap("workflowInstanceId")
    public String workflowInstanceId;

    /**
     * <strong>example:</strong>
     * <p>w-lxyy60mpgpg****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static OperateWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateWorkflowInstanceRequest self = new OperateWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public OperateWorkflowInstanceRequest setExecType(String execType) {
        this.execType = execType;
        return this;
    }
    public String getExecType() {
        return this.execType;
    }

    public OperateWorkflowInstanceRequest setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public String getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public OperateWorkflowInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
