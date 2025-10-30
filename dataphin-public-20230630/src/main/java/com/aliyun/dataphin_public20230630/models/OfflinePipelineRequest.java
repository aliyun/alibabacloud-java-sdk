// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflinePipelineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public OfflinePipelineRequestContext context;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public OfflinePipelineRequestOfflineCommand offlineCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OfflinePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflinePipelineRequest self = new OfflinePipelineRequest();
        return TeaModel.build(map, self);
    }

    public OfflinePipelineRequest setContext(OfflinePipelineRequestContext context) {
        this.context = context;
        return this;
    }
    public OfflinePipelineRequestContext getContext() {
        return this.context;
    }

    public OfflinePipelineRequest setOfflineCommand(OfflinePipelineRequestOfflineCommand offlineCommand) {
        this.offlineCommand = offlineCommand;
        return this;
    }
    public OfflinePipelineRequestOfflineCommand getOfflineCommand() {
        return this.offlineCommand;
    }

    public OfflinePipelineRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class OfflinePipelineRequestContext extends TeaModel {
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

        public static OfflinePipelineRequestContext build(java.util.Map<String, ?> map) throws Exception {
            OfflinePipelineRequestContext self = new OfflinePipelineRequestContext();
            return TeaModel.build(map, self);
        }

        public OfflinePipelineRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public OfflinePipelineRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class OfflinePipelineRequestOfflineCommand extends TeaModel {
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

        public static OfflinePipelineRequestOfflineCommand build(java.util.Map<String, ?> map) throws Exception {
            OfflinePipelineRequestOfflineCommand self = new OfflinePipelineRequestOfflineCommand();
            return TeaModel.build(map, self);
        }

        public OfflinePipelineRequestOfflineCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public OfflinePipelineRequestOfflineCommand setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public OfflinePipelineRequestOfflineCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public OfflinePipelineRequestOfflineCommand setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public OfflinePipelineRequestOfflineCommand setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
