// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitPipelineByIdRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public SubmitPipelineByIdRequestContext context;

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
     * <p>The ID used to query the pipeline task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryId")
    public SubmitPipelineByIdRequestQueryId queryId;

    public static SubmitPipelineByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPipelineByIdRequest self = new SubmitPipelineByIdRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPipelineByIdRequest setContext(SubmitPipelineByIdRequestContext context) {
        this.context = context;
        return this;
    }
    public SubmitPipelineByIdRequestContext getContext() {
        return this.context;
    }

    public SubmitPipelineByIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitPipelineByIdRequest setQueryId(SubmitPipelineByIdRequestQueryId queryId) {
        this.queryId = queryId;
        return this;
    }
    public SubmitPipelineByIdRequestQueryId getQueryId() {
        return this.queryId;
    }

    public static class SubmitPipelineByIdRequestContext extends TeaModel {
        /**
         * <p>The current operating environment. Valid values:</p>
         * <ul>
         * <li>DEV: the development environment.</li>
         * <li>PROD: the production environment.</li>
         * </ul>
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

        public static SubmitPipelineByIdRequestContext build(java.util.Map<String, ?> map) throws Exception {
            SubmitPipelineByIdRequestContext self = new SubmitPipelineByIdRequestContext();
            return TeaModel.build(map, self);
        }

        public SubmitPipelineByIdRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public SubmitPipelineByIdRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class SubmitPipelineByIdRequestQueryId extends TeaModel {
        /**
         * <p>The file ID of the integration task. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The node ID of the integration task scheduling node. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The primary key ID of the integration pipeline. You can specify any one of pipelineId, fileId, or nodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static SubmitPipelineByIdRequestQueryId build(java.util.Map<String, ?> map) throws Exception {
            SubmitPipelineByIdRequestQueryId self = new SubmitPipelineByIdRequestQueryId();
            return TeaModel.build(map, self);
        }

        public SubmitPipelineByIdRequestQueryId setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public SubmitPipelineByIdRequestQueryId setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public SubmitPipelineByIdRequestQueryId setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
