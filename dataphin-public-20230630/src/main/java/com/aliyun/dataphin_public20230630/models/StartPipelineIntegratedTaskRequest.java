// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StartPipelineIntegratedTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public StartPipelineIntegratedTaskRequestContext context;

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
     * <p>30110121</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartCommand")
    public StartPipelineIntegratedTaskRequestStartCommand startCommand;

    public static StartPipelineIntegratedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineIntegratedTaskRequest self = new StartPipelineIntegratedTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartPipelineIntegratedTaskRequest setContext(StartPipelineIntegratedTaskRequestContext context) {
        this.context = context;
        return this;
    }
    public StartPipelineIntegratedTaskRequestContext getContext() {
        return this.context;
    }

    public StartPipelineIntegratedTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public StartPipelineIntegratedTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public StartPipelineIntegratedTaskRequest setStartCommand(StartPipelineIntegratedTaskRequestStartCommand startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public StartPipelineIntegratedTaskRequestStartCommand getStartCommand() {
        return this.startCommand;
    }

    public static class StartPipelineIntegratedTaskRequestContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static StartPipelineIntegratedTaskRequestContext build(java.util.Map<String, ?> map) throws Exception {
            StartPipelineIntegratedTaskRequestContext self = new StartPipelineIntegratedTaskRequestContext();
            return TeaModel.build(map, self);
        }

        public StartPipelineIntegratedTaskRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public StartPipelineIntegratedTaskRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class StartPipelineIntegratedTaskRequestStartCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ByteSpeed")
        public Integer byteSpeed;

        /**
         * <strong>example:</strong>
         * <p>2026-09-22 15:28:31</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrent")
        public Integer concurrent;

        /**
         * <strong>example:</strong>
         * <p>RELAY</p>
         */
        @NameInMap("FullTaskMode")
        public String fullTaskMode;

        /**
         * <strong>example:</strong>
         * <p>t_1234567890_123123</p>
         */
        @NameInMap("IncrementalTaskId")
        public String incrementalTaskId;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <strong>example:</strong>
         * <p>n_1234567890</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("QuotaGroupId")
        public String quotaGroupId;

        /**
         * <strong>example:</strong>
         * <p>DI_DF</p>
         */
        @NameInMap("SyncMode")
        public String syncMode;

        public static StartPipelineIntegratedTaskRequestStartCommand build(java.util.Map<String, ?> map) throws Exception {
            StartPipelineIntegratedTaskRequestStartCommand self = new StartPipelineIntegratedTaskRequestStartCommand();
            return TeaModel.build(map, self);
        }

        public StartPipelineIntegratedTaskRequestStartCommand setByteSpeed(Integer byteSpeed) {
            this.byteSpeed = byteSpeed;
            return this;
        }
        public Integer getByteSpeed() {
            return this.byteSpeed;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setConcurrent(Integer concurrent) {
            this.concurrent = concurrent;
            return this;
        }
        public Integer getConcurrent() {
            return this.concurrent;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setFullTaskMode(String fullTaskMode) {
            this.fullTaskMode = fullTaskMode;
            return this;
        }
        public String getFullTaskMode() {
            return this.fullTaskMode;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setIncrementalTaskId(String incrementalTaskId) {
            this.incrementalTaskId = incrementalTaskId;
            return this;
        }
        public String getIncrementalTaskId() {
            return this.incrementalTaskId;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setQuotaGroupId(String quotaGroupId) {
            this.quotaGroupId = quotaGroupId;
            return this;
        }
        public String getQuotaGroupId() {
            return this.quotaGroupId;
        }

        public StartPipelineIntegratedTaskRequestStartCommand setSyncMode(String syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public String getSyncMode() {
            return this.syncMode;
        }

    }

}
