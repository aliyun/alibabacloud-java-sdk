// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineByAsyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public OfflinePipelineByAsyncRequestContext context;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public OfflinePipelineByAsyncRequestOfflineCommand offlineCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OfflinePipelineByAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineByAsyncRequest self = new OfflinePipelineByAsyncRequest();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineByAsyncRequest setContext(OfflinePipelineByAsyncRequestContext context) {
        this.context = context;
        return this;
    }
    public OfflinePipelineByAsyncRequestContext getContext() {
        return this.context;
    }

    public OfflinePipelineByAsyncRequest setOfflineCommand(OfflinePipelineByAsyncRequestOfflineCommand offlineCommand) {
        this.offlineCommand = offlineCommand;
        return this;
    }
    public OfflinePipelineByAsyncRequestOfflineCommand getOfflineCommand() {
        return this.offlineCommand;
    }

    public OfflinePipelineByAsyncRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class OfflinePipelineByAsyncRequestContext extends TeaModel {
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

        public static OfflinePipelineByAsyncRequestContext build(java.util.Map<String, ?> map) throws Exception {
            OfflinePipelineByAsyncRequestContext self = new OfflinePipelineByAsyncRequestContext();
            return TeaModel.build(map, self);
        }

        public OfflinePipelineByAsyncRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public OfflinePipelineByAsyncRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class OfflinePipelineByAsyncRequestOfflineCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

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

        public static OfflinePipelineByAsyncRequestOfflineCommand build(java.util.Map<String, ?> map) throws Exception {
            OfflinePipelineByAsyncRequestOfflineCommand self = new OfflinePipelineByAsyncRequestOfflineCommand();
            return TeaModel.build(map, self);
        }

        public OfflinePipelineByAsyncRequestOfflineCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public OfflinePipelineByAsyncRequestOfflineCommand setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public OfflinePipelineByAsyncRequestOfflineCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public OfflinePipelineByAsyncRequestOfflineCommand setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public OfflinePipelineByAsyncRequestOfflineCommand setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
