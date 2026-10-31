// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagerLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Flink deployment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7db678957dc449aab0086b931c9f8218</p>
     */
    @NameInMap("DeploymentInstanceId")
    public String deploymentInstanceId;

    /**
     * <p>The ID of the operating tenant. The gateway verifies that the current identity has access to the tenant and then injects the TenantId into the backend.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The optional ID of the operator. This parameter follows the gateway identity verification rules and is not directly bound to the backend UserId.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The TaskManager ID. This parameter can be omitted when retrieving log content. If omitted, the JobManager logs are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataphin-session-7db678957dc449aab0086b931c9f8218-taskmanazjkxq</p>
     */
    @NameInMap("TaskmanagerId")
    public String taskmanagerId;

    public static ListStreamTaskManagerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStreamTaskManagerLogsRequest self = new ListStreamTaskManagerLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListStreamTaskManagerLogsRequest setDeploymentInstanceId(String deploymentInstanceId) {
        this.deploymentInstanceId = deploymentInstanceId;
        return this;
    }
    public String getDeploymentInstanceId() {
        return this.deploymentInstanceId;
    }

    public ListStreamTaskManagerLogsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListStreamTaskManagerLogsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListStreamTaskManagerLogsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListStreamTaskManagerLogsRequest setTaskmanagerId(String taskmanagerId) {
        this.taskmanagerId = taskmanagerId;
        return this;
    }
    public String getTaskmanagerId() {
        return this.taskmanagerId;
    }

}
