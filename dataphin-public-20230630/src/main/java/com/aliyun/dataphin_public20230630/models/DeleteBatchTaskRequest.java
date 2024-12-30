// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteBatchTaskRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchTaskRequest self = new DeleteBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBatchTaskRequest setDeleteCommand(DeleteBatchTaskRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteBatchTaskRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteBatchTaskRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test task</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static DeleteBatchTaskRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteBatchTaskRequestDeleteCommand self = new DeleteBatchTaskRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteBatchTaskRequestDeleteCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DeleteBatchTaskRequestDeleteCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public DeleteBatchTaskRequestDeleteCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
