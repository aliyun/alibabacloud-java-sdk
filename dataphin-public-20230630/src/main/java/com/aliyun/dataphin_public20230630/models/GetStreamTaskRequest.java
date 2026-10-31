// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamTaskRequest extends TeaModel {
    /**
     * <p>The environment to query. Valid values: DEV for the development environment, and PROD for the production environment. If this parameter is not specified, the gateway defaults to PROD. The value is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

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
     * <p>The ID of the Dataphin project to which the task belongs. This parameter is used for project permission verification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7299592831043008</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Instance ID of the real-time task instance. Instance ID starts with t_ and is not a node ID or a file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t_8442437168737681408_20261014_8442447717177229312</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetStreamTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStreamTaskRequest self = new GetStreamTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetStreamTaskRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetStreamTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStreamTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetStreamTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetStreamTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
