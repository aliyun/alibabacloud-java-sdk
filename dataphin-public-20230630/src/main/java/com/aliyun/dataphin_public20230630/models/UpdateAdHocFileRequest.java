// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateAdHocFileRequest extends TeaModel {
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
    @NameInMap("UpdateCommand")
    public UpdateAdHocFileRequestUpdateCommand updateCommand;

    public static UpdateAdHocFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdHocFileRequest self = new UpdateAdHocFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdHocFileRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateAdHocFileRequest setUpdateCommand(UpdateAdHocFileRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateAdHocFileRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateAdHocFileRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2311113</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1212313</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static UpdateAdHocFileRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdHocFileRequestUpdateCommand self = new UpdateAdHocFileRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateAdHocFileRequestUpdateCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateAdHocFileRequestUpdateCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdateAdHocFileRequestUpdateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
