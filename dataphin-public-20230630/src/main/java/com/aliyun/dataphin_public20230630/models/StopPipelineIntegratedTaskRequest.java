// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StopPipelineIntegratedTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public StopPipelineIntegratedTaskRequestContext context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30121101</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StopCommand")
    public StopPipelineIntegratedTaskRequestStopCommand stopCommand;

    public static StopPipelineIntegratedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineIntegratedTaskRequest self = new StopPipelineIntegratedTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopPipelineIntegratedTaskRequest setContext(StopPipelineIntegratedTaskRequestContext context) {
        this.context = context;
        return this;
    }
    public StopPipelineIntegratedTaskRequestContext getContext() {
        return this.context;
    }

    public StopPipelineIntegratedTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public StopPipelineIntegratedTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public StopPipelineIntegratedTaskRequest setStopCommand(StopPipelineIntegratedTaskRequestStopCommand stopCommand) {
        this.stopCommand = stopCommand;
        return this;
    }
    public StopPipelineIntegratedTaskRequestStopCommand getStopCommand() {
        return this.stopCommand;
    }

    public static class StopPipelineIntegratedTaskRequestContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static StopPipelineIntegratedTaskRequestContext build(java.util.Map<String, ?> map) throws Exception {
            StopPipelineIntegratedTaskRequestContext self = new StopPipelineIntegratedTaskRequestContext();
            return TeaModel.build(map, self);
        }

        public StopPipelineIntegratedTaskRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public StopPipelineIntegratedTaskRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class StopPipelineIntegratedTaskRequestStopCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        public static StopPipelineIntegratedTaskRequestStopCommand build(java.util.Map<String, ?> map) throws Exception {
            StopPipelineIntegratedTaskRequestStopCommand self = new StopPipelineIntegratedTaskRequestStopCommand();
            return TeaModel.build(map, self);
        }

        public StopPipelineIntegratedTaskRequestStopCommand setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
