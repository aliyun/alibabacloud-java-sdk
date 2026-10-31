// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamLogContentRequest extends TeaModel {
    /**
     * <p>The deployment instance ID. Obtain the value from the deploymentInstanceId parameter returned in the operation record or historical running instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7db678957dc449aab0086b931c9f8218</p>
     */
    @NameInMap("DeploymentInstanceId")
    public String deploymentInstanceId;

    /**
     * <p>The original name of the log file. Obtain the value from the logName parameter in the corresponding JobManager or TaskManager log file list. Pass the value as is.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flink--standalonesession-0-dataphin-session-7db678957dc449aab0086b931c9f8218-jobmanager.log</p>
     */
    @NameInMap("LogName")
    public String logName;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The ID of the Dataphin project to which the task belongs. This parameter is used for permission verification in the production environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The optional ID of the TaskManager. Obtain the value from the taskmanagerId parameter returned by the ListStreamTaskManagers operation. If this parameter is not specified or is empty, the JobManager logs are retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>dataphin-session-7db678957dc449aab0086b931c9f8218-taskmanazjkxq</p>
     */
    @NameInMap("TaskmanagerId")
    public String taskmanagerId;

    public static GetStreamLogContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStreamLogContentRequest self = new GetStreamLogContentRequest();
        return TeaModel.build(map, self);
    }

    public GetStreamLogContentRequest setDeploymentInstanceId(String deploymentInstanceId) {
        this.deploymentInstanceId = deploymentInstanceId;
        return this;
    }
    public String getDeploymentInstanceId() {
        return this.deploymentInstanceId;
    }

    public GetStreamLogContentRequest setLogName(String logName) {
        this.logName = logName;
        return this;
    }
    public String getLogName() {
        return this.logName;
    }

    public GetStreamLogContentRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStreamLogContentRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetStreamLogContentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetStreamLogContentRequest setTaskmanagerId(String taskmanagerId) {
        this.taskmanagerId = taskmanagerId;
        return this;
    }
    public String getTaskmanagerId() {
        return this.taskmanagerId;
    }

}
