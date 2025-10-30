// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public GetPipelineByIdRequestContext context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryId")
    public GetPipelineByIdRequestQueryId queryId;

    public static GetPipelineByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineByIdRequest self = new GetPipelineByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineByIdRequest setContext(GetPipelineByIdRequestContext context) {
        this.context = context;
        return this;
    }
    public GetPipelineByIdRequestContext getContext() {
        return this.context;
    }

    public GetPipelineByIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetPipelineByIdRequest setQueryId(GetPipelineByIdRequestQueryId queryId) {
        this.queryId = queryId;
        return this;
    }
    public GetPipelineByIdRequestQueryId getQueryId() {
        return this.queryId;
    }

    public static class GetPipelineByIdRequestContext extends TeaModel {
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
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetPipelineByIdRequestContext build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdRequestContext self = new GetPipelineByIdRequestContext();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetPipelineByIdRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetPipelineByIdRequestQueryId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static GetPipelineByIdRequestQueryId build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineByIdRequestQueryId self = new GetPipelineByIdRequestQueryId();
            return TeaModel.build(map, self);
        }

        public GetPipelineByIdRequestQueryId setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetPipelineByIdRequestQueryId setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineByIdRequestQueryId setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
