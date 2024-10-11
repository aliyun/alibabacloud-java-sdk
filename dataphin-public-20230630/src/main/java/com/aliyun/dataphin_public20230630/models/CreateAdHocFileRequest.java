// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateAdHocFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateAdHocFileRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateAdHocFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdHocFileRequest self = new CreateAdHocFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdHocFileRequest setCreateCommand(CreateAdHocFileRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateAdHocFileRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateAdHocFileRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateAdHocFileRequestCreateCommand extends TeaModel {
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
         * <p>/xx1/xx2/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11212133</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateAdHocFileRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateAdHocFileRequestCreateCommand self = new CreateAdHocFileRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateAdHocFileRequestCreateCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAdHocFileRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateAdHocFileRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAdHocFileRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
