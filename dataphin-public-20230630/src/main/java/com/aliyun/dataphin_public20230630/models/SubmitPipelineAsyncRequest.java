// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitPipelineAsyncRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public SubmitPipelineAsyncRequestContext context;

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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The ID used to query the pipeline task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryId")
    public SubmitPipelineAsyncRequestQueryId queryId;

    public static SubmitPipelineAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPipelineAsyncRequest self = new SubmitPipelineAsyncRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPipelineAsyncRequest setContext(SubmitPipelineAsyncRequestContext context) {
        this.context = context;
        return this;
    }
    public SubmitPipelineAsyncRequestContext getContext() {
        return this.context;
    }

    public SubmitPipelineAsyncRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitPipelineAsyncRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitPipelineAsyncRequest setQueryId(SubmitPipelineAsyncRequestQueryId queryId) {
        this.queryId = queryId;
        return this;
    }
    public SubmitPipelineAsyncRequestQueryId getQueryId() {
        return this.queryId;
    }

    public static class SubmitPipelineAsyncRequestContext extends TeaModel {
        /**
         * <p>The current operation environment. Valid values: DEV: development environment. PROD: production environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the integration pipeline task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static SubmitPipelineAsyncRequestContext build(java.util.Map<String, ?> map) throws Exception {
            SubmitPipelineAsyncRequestContext self = new SubmitPipelineAsyncRequestContext();
            return TeaModel.build(map, self);
        }

        public SubmitPipelineAsyncRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public SubmitPipelineAsyncRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class SubmitPipelineAsyncRequestQueryId extends TeaModel {
        /**
         * <p>The ID of the integration task file. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The ID of the scheduling node for the integration task. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The primary key of the integration pipeline. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static SubmitPipelineAsyncRequestQueryId build(java.util.Map<String, ?> map) throws Exception {
            SubmitPipelineAsyncRequestQueryId self = new SubmitPipelineAsyncRequestQueryId();
            return TeaModel.build(map, self);
        }

        public SubmitPipelineAsyncRequestQueryId setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public SubmitPipelineAsyncRequestQueryId setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public SubmitPipelineAsyncRequestQueryId setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
